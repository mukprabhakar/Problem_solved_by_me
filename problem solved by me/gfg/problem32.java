/* Given a string s, extract all the integers from s. */

import java.util.ArrayList;

public class problem32 {
        ArrayList<String> extractIntegerWords(String s) 
    { 
        ArrayList<String> integers = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    integers.add(currentNumber.toString());
                    currentNumber.setLength(0);  // Clear the StringBuilder
                }
            }
        }

        // Add the last number if the string ends with digits
        if (currentNumber.length() > 0) {
            integers.add(currentNumber.toString());
        }

        return integers;
    }

    public static void main(String[] args) {
        problem32 sol = new problem32();
        String input = "abc123xyz45def6";
        ArrayList<String> result = sol.extractIntegerWords(input);
        System.out.println("Extracted integer words: " + result);
    }
}

