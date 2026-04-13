/* Adapter Pattern (Structural) - The Vibe: "A travel plug converter."
It acts as a bridge between two incompatible interfaces. 
It wraps an existing class with a new interface
so it can talk to a system it wasn't originally designed for. */

public class BankAdapter implements ModernBankingApp {
    private LegacyBankSystem oldSystem;

    public void processPayment() {
        // Translates the modern request into the old system's format
        oldSystem.oldSchoolTransfer();
    }
}
