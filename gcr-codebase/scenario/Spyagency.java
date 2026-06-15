import java.util.*;

public class WarehouseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] stock = new int[n];
        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;
        for (int value : stock) {
            if (value > max)
                max = value;

            if (value < min)
                min = value;

            total += value;
        }

        System.out.println("\nMaximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        System.out.print("Duplicate Quantities: ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    found = true;
                    break;
                }
            }
        }
        if (!found)
            System.out.print("No duplicates");
        System.out.print("\n\nEnter k for rotation: ");
        int k = sc.nextInt();
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        System.out.print("Rotated Array: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }

        System.out.print("\n\nEnter rows of shelf grid: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter shelf grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nTranspose of Shelf Grid:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}