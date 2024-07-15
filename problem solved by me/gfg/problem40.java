/* Given a string consisting of lowercase english alphabets, reverse only the vowels present 
in it and print the resulting string. */

import java.util.ArrayList;
import java.util.List;

public class problem40 {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();

        // Step 1: Collect all vowels from the string
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        // Step 2: Reverse the list of vowels
        StringBuilder reversedVowels = new StringBuilder();
        for (int i = vowels.size() - 1; i >= 0; i--) {
            reversedVowels.append(vowels.get(i));
        }

        // Step 3: Replace vowels in the original string with reversed vowels
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                result.append(reversedVowels.charAt(vowelIndex++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        problem40 solution = new problem40();

        String input = "hello";
        String result = solution.reverseVowels(input);
        System.out.println(result);  // Output: "holle"
    }
}
