/* Given a string of a constant length, print a triangle out of it. 
The triangle should start with the given string and keeps shrinking downwards by removing one character from the begining of the string. 
The spaces on the left side of the triangle should be replaced with dot character.
 */

public class problem33 {
    static String triDownwards(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            // Append leading dots
            sb.append(".".repeat(i));
            // Append the remaining substring
            sb.append(S.substring(i));
            // Append a newline character if it's not the last row
            if (i < S.length() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "TRIANGLE";
        System.out.println(triDownwards(S));
    }
}
