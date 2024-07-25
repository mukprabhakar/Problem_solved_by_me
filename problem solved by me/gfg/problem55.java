// Given two positive integers num1 and num2, the task is to find the remainder when num1 is divided by num2.

import java.util.Scanner;

public class problem55 {
     public static int findRemainder(int num1, int num2) {
        // Use the modulo operator to find the remainder
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the value of num1 for test case " + (i + 1) + ": ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the value of num2 for test case " + (i + 1) + ": ");
            int num2 = scanner.nextInt();
            
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                int remainder = findRemainder(num1, num2);
                System.out.println("The remainder when " + num1 + " is divided by " + num2 + " is: " + remainder);
            }
        }

        scanner.close();
    }
}
