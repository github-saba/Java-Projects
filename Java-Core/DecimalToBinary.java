public class DecimalToBinary {

    // This static method converts a decimal number to binary number
    static int decimalToBinary(int number){
        String digits = "";
        while (number > 0){
            digits = number%2 + digits;
            number = number/2;
        }
        return Integer.parseInt(digits);
    }
    
    public static void main(String[] args) {
        System.out.println(decimalToBinary(95));
    }
}