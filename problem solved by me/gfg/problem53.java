/*Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!. */

public class problem53 {
     // Method to calculate factorial of a number
     private static long factorial(long num) {
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate nPr
    static long nPr(long n, long r) {
        if (n < r) {
            throw new IllegalArgumentException("n should be greater than or equal to r.");
        }
        long nFactorial = factorial(n);
        long nrFactorial = factorial(n - r);
        return nFactorial / nrFactorial;
    }

    public static void main(String[] args) {
        long n = 5;  // You can change the value of n
        long r = 3;  // You can change the value of r

        long permutation = nPr(n, r);
        System.out.println("nPr (" + n + "P" + r + ") = " + permutation);
    }
}
