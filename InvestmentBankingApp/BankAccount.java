// Abstract Class – Common Banking Logic, Partial abstraction + shared code
public abstract class BankAccount {

    // private → Encapsulation
    private String accountNumber;
    private double balance;

    // protected → accessible in child classes
    protected String accountHolderName;

    // default access modifier
    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // public method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance = " + balance);
    }

    // protected method
    protected double getBalance() {
        return balance;
    }

    // abstract method (must be implemented by child)
    public abstract void calculateReturns();
}
