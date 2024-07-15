/* Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements. */

public class problem24 {
    public static int matrixSum(int[][] Grid) {
        int sum = 0;

        for (int i = 0; i < Grid.length; i++) {
            for (int j = 0; j < Grid[i].length; j++) {
                sum += Grid[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] Grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = matrixSum(Grid);
        System.out.println("The sum of the matrix elements is: " + result);
    }
}
