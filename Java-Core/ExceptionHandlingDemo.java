import java.io.*;
import java.sql.*;

/*  This single Java class that demonstrates all major exception handling features one by one with very simple examples and clear comments. 
    It covers: try -> Wrap risky code, catch -> Handle specific exceptions, finally -> Always executes, Multiple catch->	Different handling per exception, 
    Nested try -> try inside another try -> throw -> Manually throw exception, throws -> Declare exception to caller, 
  Custom Exception -> User-defined exception, try-with-resources -> Auto-close resources. */

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        System.out.println("1. Basic try-catch-finally Example");
        basicTryCatchFinally();

        System.out.println("\n 2. Multiple Catch Example");
        multipleCatchExample();

        System.out.println("\n 3. Nested Try Example");
        nestedTryExample();

        System.out.println("\n 4. throw Keyword Example");
        throwExample();

        System.out.println("\n 5. throws Keyword Example");
        try {
            throwsExample();
        } catch (IOException e) {
            System.out.println("Handled IOException from throwsExample()");
        }

        System.out.println("\n 6. Custom Exception Example");
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("\n 7. Try-With-Resources Example");
        tryWithResourcesExample();
    }

    // 1. Basic try-catch-finally
    public static void basicTryCatchFinally() {
        try {
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    // 2. Multiple catch blocks
    public static void multipleCatchExample() {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (Exception e) {
            System.out.println("Generic Exception caught");
        }
    }

    // 3. Nested try block
    public static void nestedTryExample() {
        try {
            try {
                int arr[] = new int[3];
                arr[5] = 10; // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index issue");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }

    // 4. throw keyword example
    public static void throwExample() {
        try {
            int age = 16;
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }
        } catch (ArithmeticException e) {
            System.out.println("Manually thrown exception: " + e.getMessage());
        }
    }

    // 5. throws keyword example
    public static void throwsExample() throws IOException {
        FileReader file = new FileReader("test.txt"); 
        // May throw FileNotFoundException (Checked Exception)
    }

    // 6. Custom Exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

    // 7. Try-with-resources (Java 7+)
    public static void tryWithResourcesExample() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println("Reading file...");
        } catch (IOException e) {
            System.out.println("Exception in try-with-resources: " + e.getMessage());
        }
    }
}
