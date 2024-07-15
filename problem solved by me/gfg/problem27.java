/* Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, 
Special characters and Numeric values in the string.
Note: There are no white spaces in the string. */

public class problem27 {
    public int[] count(String s) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int specialCount = 0;
        int numericCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                numericCount++;
            } else {
                specialCount++;
            }
        }

        // Create an array to store the counts
        int[] counts = {lowercaseCount, uppercaseCount, numericCount, specialCount};
        
        return counts;
    }

    public static void main(String[] args) {
        problem27 sol = new problem27();
        String input = "HelloWorld123!@#";
        int[] counts = sol.count(input);

        System.out.println("Lowercase characters: " + counts[0]);
        System.out.println("Uppercase characters: " + counts[1]);
        System.out.println("Numeric values: " + counts[2]);
        System.out.println("Special characters: " + counts[3]);
    }

    private static problem27 problem27() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'problem27'");
    }
}
