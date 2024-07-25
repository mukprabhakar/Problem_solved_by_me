/*Given a number, reverse it and add it to itself unless it becomes a palindrome or return -1 
if the number of iterations becomes more than 5. Return that palindrome number if it becomes a 
palindrome else returns -1. */

public class Problem57 {
    // Method to check if the sum of a number and its reverse is a palindrome
    static long isSumPalindrome(long n) {
        for (int i = 0; i < 5; i++) {
            if (isPalindrome(n)) {
                return n;
            }
            n = n + reverse(n);
        }
        return -1;  // Return -1 if no palindrome is found within 5 iterations
    }

    // Method to reverse the digits of a number
    static long reverse(long n) {
        long reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n = n / 10;
        }
        return reversed;
    }

    // Method to check if a number is a palindrome
    static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(Problem57.isSumPalindrome(87));   // Example test case
        System.out.println(Problem57.isSumPalindrome(123));  // Another example
    }
}
