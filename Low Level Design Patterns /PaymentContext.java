/* Strategy Pattern (Behavioral) - The Vibe: "Swapping tools for the job."
You define multiple ways to do something (like paying via Credit Card or PayPal)
and swap them out at runtime without changing the main code. */

public class PaymentContext {
    private PaymentStrategy strategy; // Could be PayPal, Crypto, or Card

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}
