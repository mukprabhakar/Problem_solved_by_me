/* Given a 2-d array of integers having N*N elements, print the transpose of the array. */

public class problem14 {
    public static int[][] transpose(int[][] matrix, int N) {
        int[][] transposedMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int N = matrix.length;

        System.out.println("Original Matrix:");
        printMatrix(matrix, N);

        int[][] transposedMatrix = transpose(matrix, N);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix, N);
    }
}

