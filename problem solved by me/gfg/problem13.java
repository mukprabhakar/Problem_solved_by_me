/* Given a sorted array Arr of size N and a value X,
 find the number of array elements less than or equal to X and elements more than or equal to X.  */

public class problem13 {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int countLessOrEqual = 0;
        int countGreater = 0;

        for (int i = 0; i < n; i++) {  // Corrected loop condition to i < n
            if (arr[i] <= x) {
                countLessOrEqual++;
            } 
            if(arr[i]>=x)
            {
                countGreater++;
            }
        }

        return new int[]{countLessOrEqual, countGreater};  // Return an array with the results
    }

    public static void main(String[] args) {
        problem13 solve = new problem13();
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int x = 3;  // Example value to compare
        int[] result = solve.getMoreAndLess(arr, arr.length, x);  // Call the method

        System.out.println("Count of elements less than or equal to " + x + ": " + result[0]);
        System.out.println("Count of elements greater than " + x + ": " + result[1]);
    }
}
