import java.util.*;

public class subsetofarray {

    // Recursive function to generate subsets
    public static void generateSubsets(int[] arr, int index, ArrayList<Integer> current) {

        // Base case: all elements are processed
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // Exclude current element (backtracking)
        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubsets(arr, 0, new ArrayList<>());

        sc.close();
    }
}