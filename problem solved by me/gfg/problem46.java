/* Given an N bit binary number, find the 1's complement of the number. 
The ones' complement of a binary number is defined as the value obtained by inverting all the bits in 
the binary representation of the number (swapping 0s for 1s and vice versa). */

public class problem46 {
    static String onesComplement(String S, int N) {
        // Initialize a StringBuilder to store the result
        StringBuilder complement = new StringBuilder();

        // Iterate through each character in the binary string
        for (char bit : S.toCharArray()) {
            // Invert the bit and append to the complement
            if (bit == '0') {
                complement.append('1');
            } else if (bit == '1') {
                complement.append('0');
            } else {
                // If the input is not a valid binary number
                throw new IllegalArgumentException("Invalid binary number");
            }
        }

        // Convert the StringBuilder to a String and return it
        return complement.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String binary1 = "1010";
        int N1 = 4;
        System.out.println("1's complement of " + binary1 + " is " + onesComplement(binary1, N1)); // Output: 0101

        String binary2 = "1111";
        int N2 = 4;
        System.out.println("1's complement of " + binary2 + " is " + onesComplement(binary2, N2)); // Output: 0000

        String binary3 = "0000";
        int N3 = 4;
        System.out.println("1's complement of " + binary3 + " is " + onesComplement(binary3, N3)); // Output: 1111

        String binary4 = "1100";
        int N4 = 4;
        System.out.println("1's complement of " + binary4 + " is " + onesComplement(binary4, N4)); // Output: 0011
    }
}
