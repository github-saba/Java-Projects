/* A simple Java class that clearly demonstrates break and continue statements.
This is easy to understand and commonly asked in interviews */
public class BreakContinueExample {

    public static void main(String[] args) {

        // Example 1: break statement
        System.out.println("Break example:");
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break; // exits the loop completely
            }

            System.out.println("i = " + i);
        }

        // Example 2: continue statement
        System.out.println("\nContinue example:");
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue; // skips current iteration
            }

            System.out.println("i = " + i);
        }
    }
}

