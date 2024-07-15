/* Given a string. Count the number of Camel Case characters in it. */

public class problem28 {
    int countCamelCase(String s) {
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if character is uppercase and not the first character
            if (Character.isUpperCase(ch) && i > 0) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        problem28 sol = new problem28();
        
        // Example usage
        String input = "CamelCaseExampleString";
        int camelCaseCount = sol.countCamelCase(input);
        
        System.out.println("Number of Camel Case characters: " + camelCaseCount);
    }
}
