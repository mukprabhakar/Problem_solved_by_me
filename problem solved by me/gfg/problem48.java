/* Given a string s as input. Delete the characters at odd indices of the string. 
Return the final string after deletion of characters at odd indices. */

public class problem48 {
    static String deleteOddIndices(String S) {
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < S.length(); i++) {
            // Append the character to the result if the index is even
            if (i % 2 == 0) {
                result.append(S.charAt(i));
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "abcdef";
        System.out.println("Original: " + input1 + " -> Without Odd Indices: " + deleteOddIndices(input1)); // Output: ace

        String input2 = "123456789";
        System.out.println("Original: " + input2 + " -> Without Odd Indices: " + deleteOddIndices(input2)); // Output: 13579

        String input3 = "hello world";
        System.out.println("Original: " + input3 + " -> Without Odd Indices: " + deleteOddIndices(input3)); // Output: hlo ol

        String input4 = "a";
        System.out.println("Original: " + input4 + " -> Without Odd Indices: " + deleteOddIndices(input4)); // Output: a

        String input5 = "";
        System.out.println("Original: " + input5 + " -> Without Odd Indices: " + deleteOddIndices(input5)); // Output: (empty string)
    }
}
