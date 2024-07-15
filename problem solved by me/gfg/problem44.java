/* Given a string S of length N, find the pattern of the strings as shown below in the examples.
Input: S = "GeeK"
Output: Geek
        Gee
        Ge
        G
Explanation: Decrease one character 
after each line
 */

import java.util.ArrayList;

public class problem44 {
    ArrayList<String> pattern(String S) {
        ArrayList<String> result = new ArrayList<>();
        int length = S.length();
        
        for (int i = 0; i < length; i++) {
            // Add substring from index 0 to length-i to the result list
            result.add(S.substring(0, length - i));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        problem44 solution = new problem44();
        String input = "ABCDE";
        ArrayList<String> result = solution.pattern(input);
        
        // Print the result
        for (String str : result) {
            System.out.println(str);
        }
    }
}
