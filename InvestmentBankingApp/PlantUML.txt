@startuml

interface Investable {
    + invest(amount : double)
    + withdraw(amount : double)
}

abstract class BankAccount {
    - accountNumber : String
    - balance : double
    # accountHolderName : String

    + deposit(amount : double)
    # getBalance() : double
    + calculateReturns()
}

class FixedDepositAccount {
    - interestRate : double
    + invest(amount : double)
    + withdraw(amount : double)
    + calculateReturns()
}

class MutualFundAccount {
    - expectedReturnRate : double
    + invest(amount : double)
    + withdraw(amount : double)
    + calculateReturns()
}

BankAccount <|-- FixedDepositAccount
BankAccount <|-- MutualFundAccount
Investable <|.. FixedDepositAccount
Investable <|.. MutualFundAccount

@enduml
