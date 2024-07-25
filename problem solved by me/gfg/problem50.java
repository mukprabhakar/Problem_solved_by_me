/* Write a program to print Binary representation of a given number N. */

public class problem50 {
    public static String getBinaryRepresentation(int N) {
        // Special case for N = 0
        if (N == 0) {
            return "00000000000000000000000000000000";
        }

        // Initialize a StringBuilder to store the binary representation
        StringBuilder binaryRepresentation = new StringBuilder();

        // Loop until N becomes 0
        while (N > 0) {
            // Append the remainder of N divided by 2 (either 0 or 1)
            binaryRepresentation.append(N % 2);
            // Update N to be N divided by 2
            N = N / 2;
        }

        // Reverse the binary string since the above method generates the binary digits in reverse order
        binaryRepresentation.reverse();

        // Pad the binary string with leading zeros to ensure it is 32 bits long
        while (binaryRepresentation.length() < 32) {
            binaryRepresentation.insert(0, '0');
        }

        // Convert the StringBuilder to a String and return it
        return binaryRepresentation.toString();
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 5;
        System.out.println("Binary representation of " + num1 + " is: " + getBinaryRepresentation(num1)); // Output: 00000000000000000000000000000101

        int num2 = 10;
        System.out.println("Binary representation of " + num2 + " is: " + getBinaryRepresentation(num2)); // Output: 00000000000000000000000000001010

        int num3 = 0;
        System.out.println("Binary representation of " + num3 + " is: " + getBinaryRepresentation(num3)); // Output: 00000000000000000000000000000000

        int num4 = 255;
        System.out.println("Binary representation of " + num4 + " is: " + getBinaryRepresentation(num4)); // Output: 00000000000000000000000011111111

        int num5 = 32;
        System.out.println("Binary representation of " + num5 + " is: " + getBinaryRepresentation(num5)); // Output: 00000000000000000000000000100000
    }
}
