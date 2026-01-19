/* A simple Java class that demonstrates all conditional statements clearly in one place. 
This is interview-friendly and easy to understand. */
public class ConditionalStatementsExample {

    public static void main(String[] args) {

        int number = 10;
        int marks = 75;
        int day = 3;

        // 1. if statement
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // 2. if-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 3. if - else if - else statement
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // 4. switch-case statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 5. Ternary operator
        String result = (number > 0) ? "Positive number" : "Negative number";
        System.out.println(result);
    }
}
