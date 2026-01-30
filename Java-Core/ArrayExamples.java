/* A simple Java class that covers: 1D, 2D, and 3D arrays / Different ways of array declaration / Easy to read and interview-friendly*/
public class ArrayExamples {

    public static void main(String[] args) {

         // 1. One-Dimensional Arrays        

        // Declaration + initialization (single line)
        int[] a = {10, 20, 30};

        // Declaration then initialization
        int[] b;
        b = new int[]{40, 50, 60};

        // Declaration with size, then assignment
        int[] c = new int[3];
        c[0] = 70;
        c[1] = 80;
        c[2] = 90;

        System.out.println("1D Array:");
        for (int i : a) {
            System.out.println(i);
        }
        for (int i=0; i<b.length; i++) {
            System.out.println(b[i]);
        }

        // 2. Two-Dimensional Arrays
       
        // 2D array with values
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 2D array with size
        int[][] table = new int[2][2];
        table[0][0] = 10;
        table[0][1] = 20;
        table[1][0] = 30;
        table[1][1] = 40;

        // Jagged array (rows with different sizes)
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println("\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Three-Dimensional Arrays
      
        // 3D array declaration + initialization
        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("\n3D Array:");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

