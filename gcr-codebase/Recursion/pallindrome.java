import java.util.Scanner;

public class pallindrome {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if pointers meet or cross
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for remaining characters
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}