/* Given a string s. The task is to convert characters of string to lowercase.*/

public class problem42 {
    String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        problem42 solution = new problem42();
        String input = "HELLO WORLD";
        String result = solution.toLowerCase(input);
        System.out.println(result);  // Output: hello world
    }
}
