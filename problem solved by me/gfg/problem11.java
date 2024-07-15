/* Given a array of length N, at each step it is reduced by 1 element. 
In the first step the maximum element would be removed, while in the second step 
minimum element of the remaining array would be removed, in the third step again the maximum and so on. 
Continue this till the array contains only 1 element.
And find the final element remaining in the array. */

import java.util.Arrays;

public class problem11 {
    public static int finalRemainingElement(int[] arr) {
        Arrays.sort(arr);  // Step 1: Sort the array in ascending order

        int start = 0;  // Pointer to the start of the array
        int end = arr.length - 1;  // Pointer to the end of the array

        boolean removeMax = true;  // Flag to alternate between removing max and min

        // Step 2: Simulate the removal process
        while (start != end) {
            if (removeMax) {
                end--;  // Remove the maximum element
            } else {
                start++;  // Remove the minimum element
            }
            removeMax = !removeMax;  // Alternate between removing max and min
        }

        // Step 3: Return the final remaining element
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 9, 1};  // Example array
        int result = finalRemainingElement(arr);  // Call the method
        System.out.println("The final remaining element is: " + result);
    }
}
