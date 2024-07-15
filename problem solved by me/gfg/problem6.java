// Given a stream of incoming numbers, find average or mean of the stream at every point.

import java.util.*;

public class problem6 {
    float[] streamAvg(int[] arr, int n) {
        float[] averages = new float[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            averages[i] = (float) sum / (i + 1);
        }

        return averages;
    }

    public static void main(String[] args) {
        problem6 sol = new problem6();  // Use the correct class name
        int[] arr = {1, 2, 3, 4, 5, 6};
        float[] result = sol.streamAvg(arr, arr.length);

        for (float avg : result) {
            System.out.print(avg + ", ");
        }
    }
}

