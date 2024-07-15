// Given an unsorted array arr. Find the count of elements less than or equal to the given element x.

import java.util.*;
public class problem7 {
    public int countOfElements(List<Integer> arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {  // Use arr.size() and iterate until i < arr.size()
            if (x >= arr.get(i)) {  // Use arr.get(i) to access elements in the list
                count++;
            }
        }
        return count;  // Return the final count
    }

    public static void main(String[] args) {
        problem7 sol = new problem7();
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
        int x = 4;
        int result = sol.countOfElements(arr, x);

        System.out.print("Number of elements less than or equal to " + x + ": " + result);
    }
}

