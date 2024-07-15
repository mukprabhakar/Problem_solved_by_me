/* Given two square Matrices A[][] and B[][].
 Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][]. */

public class problem22 {
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        // Loop through each row of A
        for (int i = 0; i < N; i++) {
            // Loop through each column of B
            for (int j = 0; j < N; j++) {
                // Initialize the result element to 0
                C[i][j] = 0;
                // Calculate the dot product of the i-th row of A and the j-th column of B
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix, int N) {
        // Loop through each row of the matrix
        for (int i = 0; i < N; i++) {
            // Loop through each column of the matrix
            for (int j = 0; j < N; j++) {
                // Print the element followed by a space
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int N = A.length;
        int[][] C = new int[N][N];

        multiply(A, B, C, N);

        System.out.println("Resultant Matrix C:");
        printMatrix(C, N);
    }
}

