/* Given a string S which consists of alphabets , 
numbers and special characters. You need to write a program 
to split the strings in three different strings S1, S2 and 
S3 such that the string S1 will contain all the alphabets present in S , 
the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  
The strings S1, S2 and S3 should have characters in same order as they appear in input.
*/

import java.util.ArrayList;
import java.util.List;

public class problem36 {
    static List<String> splitString(String S) 
    { 
        // Initialize StringBuilder objects to store the result strings
        StringBuilder S1 = new StringBuilder();
        StringBuilder S2 = new StringBuilder();
        StringBuilder S3 = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : S.toCharArray()) {
            if (Character.isLetter(ch)) {
                S1.append(ch);  // Append to S1 if character is an alphabet
            } else if (Character.isDigit(ch)) {
                S2.append(ch);  // Append to S2 if character is a digit
            } else {
                S3.append(ch);  // Append to S3 if character is a special character
            }
        }

        // Create a list to hold the results
        List<String> result = new ArrayList<>();
        result.add(S1.length() > 0 ? S1.toString() : "-1");
        result.add(S2.length() > 0 ? S2.toString() : "-1");
        result.add(S3.length() > 0 ? S3.toString() : "-1");

        // Return the list of strings
        return result;
    }

    public static void main(String[] args) {
        String S = "abcdef";
        List<String> result = splitString(S);

        // Print the results
        System.out.println(result.get(0));  // Print S1 (Alphabets)
        System.out.println(result.get(1));  // Print S2 (Numbers)
        System.out.println(result.get(2));  // Print S3 (Special Characters)
    }
}
