/* Main Class – Object Creation & Polymorphism, Runtime polymorphism in action.

  A clean, real-world Investment Banking–style Java example that intentionally covers ALL OOPS features:
  Class, Object, Abstract class, Interface, Inheritance, Polymorphism, Encapsulation, Abstraction, 
  All access modifiers (private, protected, public, default).

  Real-World Scenario: Investment Banking System: Banks offer different investment products, 
  All accounts follow common rules, Some rules are mandatory (interface), 
  Some behavior is shared (abstract class), Each investment type behaves differently (polymorphism).
*/ 

public class InvestmentBankingApp {

    public static void main(String[] args) {

        // Polymorphism using interface
        Investable fd = new FixedDepositAccount("FD101", "Rahul");
        fd.invest(100000);
        ((BankAccount) fd).calculateReturns();

        System.out.println("--------------------");

        Investable mf = new MutualFundAccount("MF202", "Anita");
        mf.invest(200000);
        mf.withdraw(50000);
        ((BankAccount) mf).calculateReturns();
    }
}
