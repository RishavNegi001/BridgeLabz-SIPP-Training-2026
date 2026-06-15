import java.util.Scanner;

public class SecretMessageValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the secret code: ");
        String code = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        String vowelList = "aeiouAEIOU";

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (Character.isLetter(ch)) {
                if (vowelList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                specialCharacters++;
            }
        }
        String status;

        if (code.length() >= 8 && digits >= 2 && specialCharacters >= 1) {
            status = "Strong";
        } else {
            status = "Weak";
        }

        System.out.println("\n--- Secret Code Report ---");
        System.out.println("Code Length: " + code.length());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
        System.out.println("Code Strength: " + status);

        if (status.equals("Weak")) {
            System.out.println("\nRequirements not satisfied:");

            if (code.length() < 8) {
                System.out.println("- Minimum length should be 8 characters.");
            }

            if (digits < 2) {
                System.out.println("- Code must contain at least 2 digits.");
            }

            if (specialCharacters < 1) {
                System.out.println("- Code must contain at least 1 special character.");
            }
        }

        sc.close();
    }
}