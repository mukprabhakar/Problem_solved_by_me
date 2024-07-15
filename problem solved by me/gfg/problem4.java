/*  The task is to complete the function IsPerfect(), which takes an array arr  of size n , and returns
the boolean value true if it is Perfect else false. The driver will print itself "PERFECT" or "NOT PERFECT" accordingly. */

public class problem4 {
    public static boolean isPerfect(int n, int[] arr) 
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[n-i-1])
            continue;
            else 
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n= 5;
        int arr[]={1,2,3,2,1};
        boolean result = isPerfect(n, arr);
        System.out.println("Given array is a perfect array : "+ result);
    }
}
