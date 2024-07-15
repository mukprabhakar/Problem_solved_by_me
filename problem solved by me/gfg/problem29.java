/* Given two square matrices Grid1 and Grid2 with the same dimensions(NxN).Check whether they are identical or not. */

public class problem29 {
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        // Iterate through each element in the matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Compare corresponding elements in Grid1 and Grid2
                if (Grid1[i][j] != Grid2[i][j]) {
                    return 0;  // If any corresponding elements are not equal, matrices are not identical
                }
            }
        }
        
        return 1;  // If all corresponding elements are equal, matrices are identical
    }
    
    public static void main(String[] args) {
        problem29 sol = new problem29();
        
        int[][] Grid1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] Grid2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int result = sol.areMatricesIdentical(3, Grid1, Grid2);
        System.out.println("The matrices are identical: " + (result == 1));
        
        int[][] Grid3 = {
            {1, 2, 3},
            {4, 5, 0},
            {7, 8, 9}
        };
        
        result = sol.areMatricesIdentical(3, Grid1, Grid3);
        System.out.println("The matrices are identical: " + (result == 1));
    }
}
