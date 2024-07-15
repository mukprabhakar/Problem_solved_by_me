/* Given a string, check if all its characters are the same or not.*/

public class problem37 {
    Boolean check (String s)
    {
        // Check if the string is empty or has only one character
        if (s == null || s.length() <= 1) {
            return true;
        }

        // Get the first character
        char firstChar = s.charAt(0);

        // Iterate through the string to check if all characters are the same
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false; // Return false if any character is different
            }
        }

        // Return true if all characters are the same
        return true;
    }

    public static void main(String[] args) {
        problem37 sol = new problem37();

        // Test cases
        String s1 = "aaaa";
        String s2 = "abc";
        String s3 = "";
        String s4 = "bbbbbb";

        System.out.println(sol.check(s1)); // Output: true
        System.out.println(sol.check(s2)); // Output: false
        System.out.println(sol.check(s3)); // Output: true
        System.out.println(sol.check(s4)); // Output: true
    } 
}
