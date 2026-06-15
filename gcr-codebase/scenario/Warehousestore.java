import java.util.*;

public class WarehouseStock {
    public static int findMax(int[] stock) {
        int max = stock[0];
        for (int value : stock) {
            if (value > max)
                max = value;
        }
        return max;
    }

    public static int findMin(int[] stock) {
        int min = stock[0];
        for (int value : stock) {
            if (value < min)
                min = value;
        }
        return min;
    }

    public static int findTotal(int[] stock) {
        int total = 0;
        for (int value : stock) {
            total += value;
        }
        return total;
    }

    public static void findDuplicates(int[] stock) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int value : stock) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate stock quantities");
        } else {
            System.out.println("Duplicate quantities: " + duplicates);
        }
    }

    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n;

        reverse(stock, 0, n - 1);
        reverse(stock, 0, k - 1);
        reverse(stock, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void transpose(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = grid[i][j];
            }
        }

        System.out.println("Transposed Shelf Grid:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {50, 20, 30, 50, 10, 40, 20};

        System.out.println("Stock Array: " + Arrays.toString(stock));

        System.out.println("Maximum Stock: " + findMax(stock));
        System.out.println("Minimum Stock: " + findMin(stock));
        System.out.println("Total Stock: " + findTotal(stock));

        findDuplicates(stock);
        int k = 3;
        rotateArray(stock, k);

        System.out.println("\nStock after rotating by " + k + " positions:");
        System.out.println(Arrays.toString(stock));

        int[][] shelf = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\nOriginal Shelf Grid:");
        for (int[] row : shelf) {
            System.out.println(Arrays.toString(row));
        }

        transpose(shelf);
    }
}