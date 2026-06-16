import java.util.Scanner;

public class numbersnto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}