import java.util.Scanner;

public class towerOfHanoi {

    // Recursive function for Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, source, destination, auxiliary);

        // Move the largest disk to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        towerOfHanoi(n, 'A', 'B', 'C');

        sc.close();
    }
}