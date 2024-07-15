/* Given two square matrices matrixA and matrixB of size n x n.  Find the addition of these two matrices. */

public class problem20 {
    public static void Addition(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;

        // Iterate through each element of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Add corresponding elements of matrixB to matrixA
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Perform the addition
        Addition(matrixA, matrixB);

        // Print the result matrix (matrixA)
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
