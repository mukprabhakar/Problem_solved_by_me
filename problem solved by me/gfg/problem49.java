/* Given a string str, convert the first letter of each word in the string to uppercase.  */

public class problem49 {
    static String convertToUppercase(String str) {
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Convert the input string to a character array
        char[] chars = str.toCharArray();

        // Flag to indicate if the current character is the start of a word
        boolean isWordStart = true;

        // Iterate through each character in the string
        for (char ch : chars) {
            // If the current character is a space, it indicates the end of a word
            if (ch == ' ') {
                isWordStart = true;
                result.append(ch);
            } else if (isWordStart) {
                // If it's the start of a word, convert the character to uppercase
                result.append(Character.toUpperCase(ch));
                isWordStart = false;
            } else {
                // Otherwise, append the character as is
                result.append(ch);
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "hello world";
        System.out.println("Original: " + input1 + " -> Converted: " + convertToUppercase(input1)); // Output: "Hello World"

        String input2 = "java programming language";
        System.out.println("Original: " + input2 + " -> Converted: " + convertToUppercase(input2)); // Output: "Java Programming Language"

        String input3 = "convert this string";
        System.out.println("Original: " + input3 + " -> Converted: " + convertToUppercase(input3)); // Output: "Convert This String"

        String input4 = "a quick brown fox jumps over the lazy dog";
        System.out.println("Original: " + input4 + " -> Converted: " + convertToUppercase(input4)); // Output: "A Quick Brown Fox Jumps Over The Lazy Dog"
    }
}


// method 2 
/* 
// User function Template for Java

class Solution {
    public String transform(String s) {
        // Split the input string by spaces
        String[] arr = s.split("\\s");
        StringBuilder res = new StringBuilder();

        // Iterate through each word in the array
        for (String word : arr) {
            // Get the first character and the rest of the word
            char firstChar = word.charAt(0);
            String first = Character.toString(firstChar);
            String rest = word.substring(1);

            // Append the transformed word to the result
            res.append(first.toUpperCase()).append(rest).append(" ");
        }

        // Convert the StringBuilder to a string and remove the trailing space
        return res.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases
        Solution solution = new Solution();
        
        String input1 = "hello world";
        System.out.println("Original: " + input1 + " -> Transformed: " + solution.transform(input1)); // Output: "Hello World"

        String input2 = "java programming language";
        System.out.println("Original: " + input2 + " -> Transformed: " + solution.transform(input2)); // Output: "Java Programming Language"

        String input3 = "convert this string";
        System.out.println("Original: " + input3 + " -> Transformed: " + solution.transform(input3)); // Output: "Convert This String"

        String input4 = "a quick brown fox jumps over the lazy dog";
        System.out.println("Original: " + input4 + " -> Transformed: " + solution.transform(input4)); // Output: "A Quick Brown Fox Jumps Over The Lazy Dog"
    }
} 

 */