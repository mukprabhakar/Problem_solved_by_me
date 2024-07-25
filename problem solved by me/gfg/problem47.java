/* Given a string, remove the vowels from the string. */

public class problem47 {
    static String removeVowels(String S) {
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Define a string containing all vowels
        String vowels = "aeiouAEIOU";

        // Iterate through each character in the input string
        for (char ch : S.toCharArray()) {
            // Append to result if the character is not a vowel
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "hello";
        System.out.println("Original: " + input1 + " -> Without Vowels: " + removeVowels(input1)); // Output: hll

        String input2 = "world";
        System.out.println("Original: " + input2 + " -> Without Vowels: " + removeVowels(input2)); // Output: wrld

        String input3 = "aeiou";
        System.out.println("Original: " + input3 + " -> Without Vowels: " + removeVowels(input3)); // Output: (empty string)

        String input4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Original: " + input4 + " -> Without Vowels: " + removeVowels(input4)); // Output: BCDFGHJKLMNPQRSTVWXYZ

        String input5 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Original: " + input5 + " -> Without Vowels: " + removeVowels(input5)); // Output: bcdfghjklmnpqrstvwxyz
    }
}
