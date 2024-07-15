/* Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false. */

public class problem18 {
    public static boolean allPalindromes(int[] arr) {
        for (int num : arr) {
            String str = String.valueOf(num); // Convert number to string
            if (!isPalindrome(str)) { // Check if the string is not a palindrome
                return false; // Return false if any element is not a palindrome
            }
        }
        return true; // All elements are palindromes
    }
    
    // Helper function to check if a string is palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        int[] arr1 = {121, 1331, 1221}; // Example array with all palindromes
        int[] arr2 = {123, 1331, 1221}; // Example array with a non-palindrome
        
        System.out.println("Array 1 all palindromes: " + allPalindromes(arr1)); // true
        System.out.println("Array 2 all palindromes: " + allPalindromes(arr2)); // false
    }
}
