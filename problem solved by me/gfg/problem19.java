/* Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order. */

import java.util.Arrays;

public class problem19 {
    public long[] findElements(long a[], long n) {
        // Step 1: Sort the array
        Arrays.sort(a);

        // Step 2: Create a new array to store elements except the last two
        long[] result = new long[(int) n - 2];

        // Step 3: Copy elements from the sorted array to the result array
        for (int i = 0; i < n - 2; i++) {
            result[i] = a[i];
        }

        // Step 4: Return the result array
        return result;
    }

    public static void main(String[] args) {
        problem19 solution = new problem19();
        long[] arr = {5, 1, 9, 2, 7, 6}; // Example array
        long n = arr.length;

        long[] result = solution.findElements(arr, n);

        // Print the result array
        System.out.println("Elements except two greatest in sorted order:");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
