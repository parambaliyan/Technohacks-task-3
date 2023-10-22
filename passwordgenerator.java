import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user-defined criteria
        System.out.print("Enter the desired password length: ");
        int passwordLength = scanner.nextInt();

        System.out.print("Include uppercase letters (Y/N)? ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include lowercase letters (Y/N)? ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include numbers (Y/N)? ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include special characters (Y/N)? ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("Y");

        // Define character sets
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        // Create a character set based on user criteria
        String allChars = "";
        if (includeUppercase) allChars += uppercaseChars;
        if (includeLowercase) allChars += lowercaseChars;
        if (includeNumbers) allChars += numberChars;
        if (includeSpecialChars) allChars += specialChars;

        // Check if at least one character type is selected
        if (allChars.isEmpty()) {
            System.out.println("Please select at least one character type.");
            return;
        }

        // Generate the random password
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }

        // Display the generated password
        System.out.println("Generated Password: " + password.toString());
    }
}
