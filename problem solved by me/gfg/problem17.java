/* Given an array arr of size n, print all its elements space-separated.

Note: You don't need to move to the next line after printing all elements of the array (space-separated) */

public class problem17 {
     // Print the space-separated array elements
     void printArray(int arr[], int n) {
        // Iterate through the array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        problem17 sol = new problem17();
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int n = arr.length;

        sol.printArray(arr, n);  // Print the array elements
    }
}
