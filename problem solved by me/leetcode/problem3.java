/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1 */

import java.util.Scanner;

public class problem3 {
    // Function to find the single number using XOR
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all elements
        }
        return result; // The result will be the single number
    }

    public static void main(String[] args) {
        // Creating an instance of the Solution class
        problem3 solution = new problem3();
        
        // Reading input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        // Initializing the array
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Calling the singleNumber function and displaying the result
        int single = solution.singleNumber(nums);
        System.out.println("The single number is: " + single);
        
        sc.close(); // Closing the scanner
    }
}
