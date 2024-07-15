/* Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals. */

public class problem23 {
    public static int diagonalDifference(int[][] Grid) {
        int n = Grid.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += Grid[i][i];             // Summing the primary diagonal elements
            secondarySum += Grid[i][n - i - 1];   // Summing the secondary diagonal elements
        }

        return Math.abs(primarySum - secondarySum);  // Returning the absolute difference
    }

    public static void main(String[] args) {
        int[][] Grid = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        int result = diagonalDifference(Grid);
        System.out.println("The absolute difference between the sums of the diagonals is: " + result);
    }
}
