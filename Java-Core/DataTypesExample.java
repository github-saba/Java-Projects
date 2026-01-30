// A simple Java class that demonstrates all main data types, variables, and constants, written in a clear and beginner-friendly way.
public class DataTypesExample {

    // Constants (static final)
    public static final int MAX_USERS = 100;
    public static final double PI = 3.14159;
    public static final String APP_NAME = "DemoApp";

    public static void main(String[] args) {

        // 1. Primitive Data Types

        byte b = 10;                 // 8-bit integer
        short s = 200;               // 16-bit integer
        int i = 1000;                // 32-bit integer
        long l = 100000L;            // 64-bit integer

        float f = 10.5f;             // 32-bit decimal
        double d = 99.99;            // 64-bit decimal

        char c = 'A';                // single character
        boolean flag = true;         // true or false

        // 2. Non-Primitive (Reference) Data Types

        String name = "ChatGPT";     // String object
        int[] numbers = {1, 2, 3};   // Array
        Object obj = new Object();   // Object class

        // 3. Printing values

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + name);
        System.out.println("Array first element: " + numbers[0]);
        System.out.println("Object: " + obj);

        System.out.println("\nConstants:");
        System.out.println("MAX_USERS: " + MAX_USERS);
        System.out.println("PI: " + PI);
        System.out.println("APP_NAME: " + APP_NAME);
    }
}
