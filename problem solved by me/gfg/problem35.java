/* Given a list of characters, merge all of them into a string.*/

public class problem35 {
    public String chartostr(char arr[], int N) {
        // Create a StringBuilder to store the resulting string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the array
        for (int i = 0; i < N; i++) {
            // Append each character to the StringBuilder
            result.append(arr[i]);
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
    
    public static void main(String[] args) {
        problem35 solution = new problem35();
        
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        int N = chars.length;

        System.out.println(solution.chartostr(chars, N)); // Output: "Hello"
    }
}
