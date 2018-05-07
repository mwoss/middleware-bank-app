package bank;

import exchange_rate.ExchangeServiceImpl;
import exchange_rate.proto.gen.Currency;
import exchange_rate.proto.gen.CurrencyProviderGrpc;
import exchange_rate.proto.gen.CurrencyType;
import exchange_rate.proto.gen.ExchangeRate;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Bank {

    private static final Logger logger = Logger.getLogger(ExchangeServiceImpl.class.getName());
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final ManagedChannel channel;
    private final CurrencyProviderGrpc.CurrencyProviderStub currencyProviderStub;

    private final Map<CurrencyType, Double> exchangeRateValue = new HashMap<>();
    private String bankName;

    public Bank(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid needing certificates.
                .usePlaintext(true)
                .build();

        currencyProviderStub = CurrencyProviderGrpc.newStub(channel);
    }

    private void start() throws InterruptedException {
        System.out.println("Input bank name");
        try {
            bankName = br.readLine();
            System.out.println("Type currencies you are interested in (PLN, JEN, EUR, USD, SZK)");
            System.out.println("Use ; to separate currencies");
            String currencies = br.readLine();
            Arrays.stream(currencies.split(";"))
                    .forEach(currency -> exchangeRateValue.put(CurrencyType.valueOf(currency), 1.0));
        } catch (IOException e) {
            System.out.println("Something went wrong. Try again");
            System.exit(-1);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid currency name");
            System.exit(-2);
        }
        subscribeOnExchangeRate();
        Thread.sleep(5000);
        shutdown();
    }


    private void subscribeOnExchangeRate() {
        currencyProviderStub
                .getExchangeRates(
                        Currency.newBuilder().addAllCurrency(exchangeRateValue.keySet()).build(),
                        new StreamObserver<ExchangeRate>() {
                            @Override
                            public void onNext(ExchangeRate exchangeRate) {
                                exchangeRateValue.replace(exchangeRate.getCurrency(), exchangeRate.getRate());
                                logger.info(exchangeRate.getCurrency() + " value: " + exchangeRate.getRate());
                            }

                            @Override
                            public void onError(Throwable throwable) {
                                logger.warn("Encountered error in bank ExchangeRates", throwable);
                                logger.warn(throwable.getMessage());

                            }

                            @Override
                            public void onCompleted() {
                                logger.info("Streaming completed");
                            }
                        }
                );
    }

    private void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        Bank client = new Bank("localhost", 50051);
        client.start();
    }
}
