/* Given a positive integer N, determine whether it is odd or even. */

public class problem45 {
    public String oddOrEven(int N) {
        // Check if the number is even
        if (N % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        problem45 solution = new problem45();

        // Test cases
        int test1 = 5;
        int test2 = 8;
        int test3 = 0; // Assuming 0 is considered an even number
        int test4 = 123;

        System.out.println("Test1: " + test1 + " is " + solution.oddOrEven(test1)); // Output: Odd
        System.out.println("Test2: " + test2 + " is " + solution.oddOrEven(test2)); // Output: Even
        System.out.println("Test3: " + test3 + " is " + solution.oddOrEven(test3)); // Output: Even
        System.out.println("Test4: " + test4 + " is " + solution.oddOrEven(test4)); // Output: Odd
    }
}
