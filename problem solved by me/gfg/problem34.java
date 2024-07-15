public class problem34 {
    String modify(String S) {
        // Create a StringBuilder to store the result without spaces
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : S.toCharArray()) {
            // If the character is not a space, append it to the result
            if (ch != ' ') {
                result.append(ch);
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        problem34 solution = new problem34();

        String str1 = "Hello World";
        String str2 = "   Remove   Spaces   ";
        String str3 = "NoSpacesHere";

        System.out.println(solution.modify(str1)); // Output: "HelloWorld"
        System.out.println(solution.modify(str2)); // Output: "RemoveSpaces"
        System.out.println(solution.modify(str3)); // Output: "NoSpacesHere"
    }
}