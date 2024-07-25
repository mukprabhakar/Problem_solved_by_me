/*Given a number N.Check if it is Full Prime or not. 
Note : A full prime number is one in which the number itself is prime and all its digits are also prime. */

public class problem56 {
     // Function to check if a number is prime
     public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to check if all digits of a number are prime
    public static boolean areAllDigitsPrime(int n) {
        String numStr = Integer.toString(n);
        for (char digit : numStr.toCharArray()) {
            if (digit != '2' && digit != '3' && digit != '5' && digit != '7') {
                return false;
            }
        }
        return true;
    }

    // Function to check if a number is a full prime
    public static boolean isFullPrime(int n) {
        return isPrime(n) && areAllDigitsPrime(n);
    }

    public static void main(String[] args) {
        // Example numbers to check
        int[] testNumbers = {2, 3, 5, 7, 23, 37, 73, 113, 233, 357};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " a full prime? " + isFullPrime(num));
        }
    }
}
