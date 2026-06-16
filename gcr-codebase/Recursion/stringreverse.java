import java.util.Scanner;

public class stringreverse {

    // Recursive function to reverse a string
    public static String reverseString(String str) {
        // Base case
        if (str.isEmpty()) {
            return str;
        }

        // Recursive call: reverse remaining string + first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String reversed = reverseString(str);

        System.out.println(reversed);

        sc.close();
    }
}