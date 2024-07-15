// You are given an integer array arr[]. The task is to find the sum of it.

public class problem9 {
    public int sum(int arr[]) {
        int sum = 0;  // Initialize the sum variable
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add each element to the sum
        }
        return sum;  // Return the calculated sum
    }

    public static void main(String[] args) {
        problem9 sol = new problem9();
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int result = sol.sum(arr);  // Call the sum method
        System.out.println("The sum of the array is: " + result);
    }
}
