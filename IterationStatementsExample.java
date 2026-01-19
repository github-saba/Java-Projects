/* A simple and clean Java class that demonstrates all iteration (looping) statements in one place.
This is easy to remember and interview-ready. */
public class IterationStatementsExample {

    public static void main(String[] args) {

        // 1. for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. for-each loop
        System.out.println("\nFor-each loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number = " + num);
        }

        // 3. while loop
        System.out.println("\nWhile loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }

        // 4. do-while loop
        System.out.println("\nDo-while loop:");
        int x = 1;
        do {
            System.out.println("x = " + x);
            x++;
        } while (x <= 5);
    }
}

