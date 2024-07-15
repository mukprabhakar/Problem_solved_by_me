/* Given an array arr of size n, swap the kth element from the beginning with kth element from the end. */

public class problem16 {
    public static void swapKth(int n, int k, int[] arr) {
        // Check if k is a valid index
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k");
            return;
        }

        // Swap the k-th element from the beginning with the k-th element from the end
        int temp = arr[k - 1];  // k-th element from the beginning (0-based index)
        arr[k - 1] = arr[n - k];  // k-th element from the end
        arr[n - k] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int n = arr.length;
        int k = 2;  // Example k value

        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        swapKth(n, k, arr);

        System.out.println("Array after swapping: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
