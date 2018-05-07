package exchange_rate.proto.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: exchange.proto")
public final class CurrencyProviderGrpc {

  private CurrencyProviderGrpc() {}

  public static final String SERVICE_NAME = "CurrencyProvider";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetExchangeRatesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<exchange_rate.proto.gen.Currency,
      exchange_rate.proto.gen.ExchangeRate> METHOD_GET_EXCHANGE_RATES = getGetExchangeRatesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<exchange_rate.proto.gen.Currency,
      exchange_rate.proto.gen.ExchangeRate> getGetExchangeRatesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<exchange_rate.proto.gen.Currency,
      exchange_rate.proto.gen.ExchangeRate> getGetExchangeRatesMethod() {
    return getGetExchangeRatesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<exchange_rate.proto.gen.Currency,
      exchange_rate.proto.gen.ExchangeRate> getGetExchangeRatesMethodHelper() {
    io.grpc.MethodDescriptor<exchange_rate.proto.gen.Currency, exchange_rate.proto.gen.ExchangeRate> getGetExchangeRatesMethod;
    if ((getGetExchangeRatesMethod = CurrencyProviderGrpc.getGetExchangeRatesMethod) == null) {
      synchronized (CurrencyProviderGrpc.class) {
        if ((getGetExchangeRatesMethod = CurrencyProviderGrpc.getGetExchangeRatesMethod) == null) {
          CurrencyProviderGrpc.getGetExchangeRatesMethod = getGetExchangeRatesMethod = 
              io.grpc.MethodDescriptor.<exchange_rate.proto.gen.Currency, exchange_rate.proto.gen.ExchangeRate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CurrencyProvider", "getExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  exchange_rate.proto.gen.Currency.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  exchange_rate.proto.gen.ExchangeRate.getDefaultInstance()))
                  .setSchemaDescriptor(new CurrencyProviderMethodDescriptorSupplier("getExchangeRates"))
                  .build();
          }
        }
     }
     return getGetExchangeRatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyProviderStub newStub(io.grpc.Channel channel) {
    return new CurrencyProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CurrencyProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CurrencyProviderFutureStub(channel);
  }

  /**
   */
  public static abstract class CurrencyProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void getExchangeRates(exchange_rate.proto.gen.Currency request,
        io.grpc.stub.StreamObserver<exchange_rate.proto.gen.ExchangeRate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeRatesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExchangeRatesMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                exchange_rate.proto.gen.Currency,
                exchange_rate.proto.gen.ExchangeRate>(
                  this, METHODID_GET_EXCHANGE_RATES)))
          .build();
    }
  }

  /**
   */
  public static final class CurrencyProviderStub extends io.grpc.stub.AbstractStub<CurrencyProviderStub> {
    private CurrencyProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyProviderStub(channel, callOptions);
    }

    /**
     */
    public void getExchangeRates(exchange_rate.proto.gen.Currency request,
        io.grpc.stub.StreamObserver<exchange_rate.proto.gen.ExchangeRate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetExchangeRatesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurrencyProviderBlockingStub extends io.grpc.stub.AbstractStub<CurrencyProviderBlockingStub> {
    private CurrencyProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<exchange_rate.proto.gen.ExchangeRate> getExchangeRates(
        exchange_rate.proto.gen.Currency request) {
      return blockingServerStreamingCall(
          getChannel(), getGetExchangeRatesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurrencyProviderFutureStub extends io.grpc.stub.AbstractStub<CurrencyProviderFutureStub> {
    private CurrencyProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyProviderFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_EXCHANGE_RATES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXCHANGE_RATES:
          serviceImpl.getExchangeRates((exchange_rate.proto.gen.Currency) request,
              (io.grpc.stub.StreamObserver<exchange_rate.proto.gen.ExchangeRate>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CurrencyProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return exchange_rate.proto.gen.ExchangeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyProvider");
    }
  }

  private static final class CurrencyProviderFileDescriptorSupplier
      extends CurrencyProviderBaseDescriptorSupplier {
    CurrencyProviderFileDescriptorSupplier() {}
  }

  private static final class CurrencyProviderMethodDescriptorSupplier
      extends CurrencyProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyProviderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CurrencyProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyProviderFileDescriptorSupplier())
              .addMethod(getGetExchangeRatesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
