/* Given two strings S1 and S2 as input. 
Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
*/

public class problem39 {
    public String concatenateAndReverse(String S1, String S2) {
        // Step 1: Concatenate the two strings
        String concatenated = S1 + S2;

        // Step 2: Reverse the concatenated string
        StringBuilder reversed = new StringBuilder(concatenated);
        reversed.reverse();

        // Step 3: Return the reversed string
        return reversed.toString();
    }

    public static void main(String[] args) {
        problem39 solution = new problem39();

        String S1 = "Hello";
        String S2 = "World";

        String result = solution.concatenateAndReverse(S1, S2);
        System.out.println(result);  // Output: dlroWolleH
    }
}
