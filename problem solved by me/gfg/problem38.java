/* Given a non-empty sequence of characters str, return true if sequence is Binary, else return false*/

public class problem38 {
    public boolean isBinary(String str) {
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is neither '0' nor '1'
            if (ch != '0' && ch != '1') {
                return false;  // Return false if any character is not binary
            }
        }
        // Return true if all characters are '0' or '1'
        return true;
    }

    public static void main(String[] args) {
        problem38 solution = new problem38();

        // Test cases
        String str1 = "101010";
        String str2 = "11002";
        String str3 = "000111";
        String str4 = "123456";

        System.out.println(solution.isBinary(str1)); // Output: true
        System.out.println(solution.isBinary(str2)); // Output: false
        System.out.println(solution.isBinary(str3)); // Output: true
        System.out.println(solution.isBinary(str4)); // Output: false
    }
}
