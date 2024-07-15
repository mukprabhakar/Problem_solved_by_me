/* Given a square matrix of size n×n. Your task is to calculate the sum of its diagonals. */

public class problem21 {
    public int DiagonalSum(int[][] matrix) {
        int leftSum = 0;
        int rightSum = 0;
        int n = matrix.length;

        // Calculate the sum of the primary diagonal
        for (int i = 0; i < n; i++) {
            leftSum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            rightSum += matrix[i][n - i - 1];
        }

        // If the matrix size is odd, subtract the middle element once
        if (n % 2 == 1) {
            rightSum -= matrix[n / 2][n / 2];
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        problem21 sol = new problem21();
        int[][] matrix = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        int result = sol.DiagonalSum(matrix);
        System.out.println("The sum of the diagonals is: " + result);
    }
}

