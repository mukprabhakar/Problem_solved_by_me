/* A and B are good friend and programmers. They are always in a healthy 
competition with each other. They decide to judge the best among them by competing. 
They do so by comparing their three skills as per their values. Please help them doing so as they are busy.

Set for A are like [a1, a2, a3]
Set for B are like [b1, b2, b3]

Compare ith skill of A with ith skill of B
if a[i] > b[i] , A's score increases by 1
if a[i] < b[i] , B's score increases by 1
if a[i] = b[i] , nothing happens */

public class problem8 {
    
    public static int[] scores(int[] a, int[] b) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                count1++;
            } else if (a[i] < b[i]) {
                count2++;
            }
        }
        return new int[]{count1, count2};
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 7};  // Example skills for A
        int[] B = {3, 6, 9};  // Example skills for B

        int[] result = scores(A, B);  // Call the scores method
        System.out.println("A's score: " + result[0]);
        System.out.println("B's score: " + result[1]);

        if (result[0] > result[1]) {
            System.out.println("A is the better programmer.");
        } else if (result[0] < result[1]) {
            System.out.println("B is the better programmer.");
        } else {
            System.out.println("A and B are equally skilled.");
        }
    }
}

