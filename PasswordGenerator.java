import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean useLower = scanner.nextBoolean();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean useUpper = scanner.nextBoolean();

        System.out.print("Include numbers? (true/false): ");
        boolean useNumbers = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean useSpecial = scanner.nextBoolean();

        String password = generatePassword(length, useLower, useUpper, useNumbers, useSpecial);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean lower, boolean upper,
                                          boolean numbers, boolean special) {

        StringBuilder characterPool = new StringBuilder();

        if (lower) characterPool.append(LOWERCASE);
        if (upper) characterPool.append(UPPERCASE);
        if (numbers) characterPool.append(NUMBERS);
        if (special) characterPool.append(SPECIAL);

        if (characterPool.length() == 0) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
