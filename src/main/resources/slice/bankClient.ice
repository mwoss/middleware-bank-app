#ifdef BANK_ICE
#define BANK_ICE

module bankClientcd{
    enum AccountType{
        NORMAL = 0,
        PREMIUM = 1
    };
    enum CurrencyType{
        PLN = 0,
        EUR = 1,
        JEN = 2,
        USD = 3,
        SZK = 4
    };

    exception UnsupportedCurrencyException{
        string reason;
    };
    exception DateFormatException{
        string reason;
    };
    exception InvalidPeselStructure{
        string reason;
    };

    class Date{
        byte day;
        byte month;
        byte year;
    };

    class Person{
        string name;
        string surname;
        string pesel;
    };

    class Credit{
        double cost;
        Date startDate;
        Date endDate;
        CurrencyType currencyType;
    };

    class CreditInfo{
      CurrencyType baseCurrencyType;
      double baseCreditCost;
      CurrencyType foreignCurrencyType;
      double foreignCreditCost;
    };

    interface Account{
        double accountBalance();
    };
    interface PremiumAccount extends Account{
        CreditInfo getCredit(Credit credit) throws DateFormatException, UnsupportedCurrencyException;
    };

    interface AccountFactory{
        Account* createAccount(Person person, double accoutBalance) throws InvalidPeselStructure;
    };
};

#endif