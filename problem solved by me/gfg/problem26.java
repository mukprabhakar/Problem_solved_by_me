/* Given a string S and two integers L and R. Print the characters in the range L to R of the string.
NOTE: Assume zero based indexing.
 */

public class problem26 {
    public static void printSubstringInRange(String S, int L, int R) {
        // Extract the substring from index L to R (inclusive)
        String result = S.substring(L, R + 1);
        
        // Print the result
        System.out.println(result);
    }

    public static void main(String[] args) {
        String S = "HelloWorld";
        int L = 2;
        int R = 5;
        
        printSubstringInRange(S, L, R); // This should print "lloW"
    }
}
