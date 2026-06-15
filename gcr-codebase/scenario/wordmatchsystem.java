import java.util.Arrays;
import java.util.Scanner;

public class wordmatchsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\nStrings in Uppercase:");
        System.out.println("String 1: " + str1.toUpperCase());
        System.out.println("String 2: " + str2.toUpperCase());

        System.out.println("\nLength of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\nResult: The strings are ANAGRAMS.");
        } else {
            System.out.println("\nResult: The strings are NOT ANAGRAMS.");
        }

        sc.close();
    }
}