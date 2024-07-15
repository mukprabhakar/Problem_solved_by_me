/* Given a string S, consisting only of english alphabets, 
replace all the alphabets with the alphabets occuring at the 
same position when counted in reverse order of alphabets. For example, 'a' 
would be replaced by 'z', 'b' by 'y', 'c' by 'x' and so on. Any capital letters would be replaced by capital letters only.
 */

public class problem31 {
    String convert(String s) 
    {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {  // Use 's' instead of 'S'
            if (Character.isLowerCase(ch)) {
                result.append((char) ('z' - (ch - 'a')));
            } else if (Character.isUpperCase(ch)) {
                result.append((char) ('Z' - (ch - 'A')));
            }
        }

        return result.toString();  // Remove the second return statement
    }
    
    public static void main(String[] args) {
        problem31 sol = new problem31();
        String input = "HelloWorld";
        String result = sol.convert(input);
        System.out.println("Replaced string: " + result);
    }
}
