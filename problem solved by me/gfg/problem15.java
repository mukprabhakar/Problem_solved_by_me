/* For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
Note: Sum is printed automatically, you only need to calculate and return the average */

public class problem15 {
    String average(int A[], int N) {
        if (N == 0) return "0.00";  // Handle division by zero if the array is empty

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        
        float avg = (float) sum / N;
        return String.format("%.2f", avg);  // Format the average to 2 decimal places
    }

    public static void main(String[] args) {
        problem15 compute = new problem15();
        int[] A = {1, 2, 3, 4, 5};  // Example array
        int N = A.length;

        String result = compute.average(A, N);
        System.out.println("The average is: " + result);
    }
}
