/* Given a string S, we need to find reciprocal of it. The reciprocal of the letter is found by finding the difference 
between the position of the letter and the first letter ‘A’. Then decreasing the same number of steps from the last letter
‘Z’. The character that we reach after above steps is reciprocal.
Reciprocal of Z is A and vice versa because if you reverse the position of the alphabet A will be in the position of Z.
Similarly, if the letter is a small case then the first letter will be 'a' and the last letter will be 'z'. and the 
definition of reciprocal remains the same.

Note: If the character is not a letter its reciprocal will be the same character. */

public class problem43 {
    String findReciprocal(String S) {
        StringBuilder result = new StringBuilder();

        for (char ch : S.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // Calculate the reciprocal for uppercase letters
                char reciprocal = (char) ('Z' - (ch - 'A'));
                result.append(reciprocal);
            } else if (Character.isLowerCase(ch)) {
                // Calculate the reciprocal for lowercase letters
                char reciprocal = (char) ('z' - (ch - 'a'));
                result.append(reciprocal);
            } else {
                // If not a letter, append the character unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        problem43 solution = new problem43();
        String input = "Hello World! Zz";
        String result = solution.findReciprocal(input);
        System.out.println(result);  // Output: Svool Dliow! Aa
    }
}
