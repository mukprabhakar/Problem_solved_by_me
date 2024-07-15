// Given an array arr of n integers and an index key(0-based index).
//  Your task is to return the element present at the index key in the array.

public class problem10 {
    public static int findElementAtIndex(int n, int key, int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current index matches the given key
            if (key == i) {
                return arr[i];  // Return the element at the specified index
            }
        }
        return -1;  // Return -1 if the index is not found in the array (optional error handling)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int key = 2;  // Example index to find
        int result = findElementAtIndex(arr.length, key, arr);  // Call the method
        System.out.println("The element at index " + key + " is: " + result);
    }
}
