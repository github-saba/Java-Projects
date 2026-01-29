// Concrete Class – Mutual Fund Account, Same interface, different behavior
public class MutualFundAccount extends BankAccount implements Investable {

    private double expectedReturnRate = 12.0;

    public MutualFundAccount(String accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public void invest(double amount) {
        deposit(amount);
        System.out.println("Invested in Mutual Funds");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Mutual Fund units redeemed");
    }

    @Override
    public void calculateReturns() {
        double returns = getBalance() * expectedReturnRate / 100;
        System.out.println("Expected MF Returns = " + returns);
    }
}
