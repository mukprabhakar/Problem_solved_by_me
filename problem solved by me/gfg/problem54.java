/*Write a program to find the sum of the given series 1+2+3+ . . . . . . (n terms)  */

import java.util.Scanner;

public class problem54 {
     public static long seriesSum(int n) {
        // Calculate the sum using a loop
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the value of n for test case " + (i + 1) + ": ");
            int n = scanner.nextInt();
            long sum = seriesSum(n);
            System.out.println("The sum of the first " + n + " terms is: " + sum);
        }

        scanner.close();
    }
}
