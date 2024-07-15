/* Given an integer x, return true if x is a palindrome, and false otherwise. */

package leetcode;

public class problem2 {
    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with zero (except zero itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x /= 10;
        }

        // A number is a palindrome if the reversed number is equal to the original number
        return reversed == original;
    }

    public static void main(String[] args) {
        int number1 = 12321;
        System.out.println(isPalindrome(number1));  // Output: true

        int number2 = -12321;
        System.out.println(isPalindrome(number2));  // Output: false

        int number3 = 123;
        System.out.println(isPalindrome(number3));  // Output: false

        int number4 = 1221;
        System.out.println(isPalindrome(number4));  // Output: true

        int number5 = 0;
        System.out.println(isPalindrome(number5));  // Output: true
    }
}
