// Concrete Class – Fixed Deposit Account, Uses inheritance + interface + polymorphism
public class FixedDepositAccount extends BankAccount implements Investable {

    private double interestRate = 6.5;

    public FixedDepositAccount(String accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public void invest(double amount) {
        deposit(amount);
        System.out.println("Invested in Fixed Deposit");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("FD withdrawal allowed only after maturity");
    }

    @Override
    public void calculateReturns() {
        double returns = getBalance() * interestRate / 100;
        System.out.println("FD Returns = " + returns);
    }
}
