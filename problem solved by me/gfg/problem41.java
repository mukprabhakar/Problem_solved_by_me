/* Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase. */ 

public class problem41 {
    String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        problem41 solution = new problem41();
        String input = "hello";
        String result = solution.toUpperCase(input);
        System.out.println(result);  // Output: HELLO
    }
}
