/*You just need to complete the function findIndex() that takes array 
 arr, integer n and integer key as parameters and returns an array of
 length 2 in which at first index contains the value of start index
  and at the second index contains the value of end index(0 based 
   is used). If the key does not exist in the array then return -1 
   for both start and end index in this case.*/


   public class problem3 {
    static int[] findIndex(int arr[], int n, int key) { 
        int[] result = {-1, -1};
        
        // Find the start index
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                result[0] = i;
                break;
            }
        }
        
        // If start index is not found, return [-1, -1]
        if (result[0] == -1) {
            return result;
        }
        
        // Find the end index
        for (int i = n - 1; i >= result[0]; i--) {
            if (arr[i] == key) {
                result[1] = i;
                break;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {6,5,4,3,1,2};
        int key = 4;
        
        int[] result = findIndex(arr, n, key);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
}
