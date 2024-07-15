// You are given an array arr. You need to print elements of arr in alternate order (starting from index 0).

public class problem5 {
    static void altarr(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {  // Iterate with a step of 2
            System.out.print(arr[i] + " ");  // Print the element at the current index
        }
    }

    public static void print(int arr[]) {
        altarr(arr);  // Call altarr to print elements in alternate order
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};  // Example array
        System.out.print("The alternate order arr is: ");
        print(arr);  // Call the print method to print the alternate order of the array
    }
}
