/* Remove all characters except the numeric characters from an alphanumeric string. */

public class problem30 {
    String removeCharacters(String S) {
        // Create a StringBuilder to store the numeric characters
        StringBuilder numericStr = new StringBuilder();
        
        // Iterate through each character in the input string S
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Append the digit to the StringBuilder
                numericStr.append(ch);
            }
        }
        
        // Convert the StringBuilder to a String and return it
        return numericStr.toString();
    }

    public static void main(String[] args) {
        problem30 sol = new problem30();
        String input = "a1b2c3d4e5";
        String result = sol.removeCharacters(input);
        System.out.println("String with only numeric characters: " + result);
    }
}
