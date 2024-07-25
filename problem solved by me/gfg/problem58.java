/*Given a number N, check whether the number is Automorphic number or not.
A number is called Automorphic number if and only if its square ends in  has the same last digit as the number itself. */

public class problem58 {
    public String is_AutomorphicNumber(int n) {
        // Compute the square of the number
        int square = n * n;
        
        // Convert the number and its square to strings
        String numStr = Integer.toString(n);
        String squareStr = Integer.toString(square);
        
        // Check if the square string ends with the number string
        if (squareStr.endsWith(numStr)) {
            return "Automorphic";
        } else {
            return "Not Automorphic";
        }
    }
    public static void main(String[] args) {
        problem58 solution = new problem58();

        System.out.println(solution.is_AutomorphicNumber(5));   // Output: Automorphic (because 5^2 = 25)
        System.out.println(solution.is_AutomorphicNumber(6));   // Output: Automorphic (because 6^2 = 36)
        System.out.println(solution.is_AutomorphicNumber(7));   // Output: Not Automorphic (because 7^2 = 49)
        System.out.println(solution.is_AutomorphicNumber(25));  // Output: Automorphic (because 25^2 = 625)
        System.out.println(solution.is_AutomorphicNumber(76));  // Output: Automorphic (because 76^2 = 5776)
    }
}
