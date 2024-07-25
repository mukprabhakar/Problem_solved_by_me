// Given two numbers A and B. Your task is to return the sum of A and B.

import java.util.Scanner;

public class problem59 {
    static int addition(int A, int B){
        return A+B;
    }
    public static void main(String[] args) {
        Scanner saamy = new Scanner(System.in);
        System.out.println("Enter two Number");
        int A = saamy.nextInt();
        int B = saamy.nextInt();
        int resuult = addition(A,B);
        System.out.println("The sum of "+A+" And "+B+" is "+resuult);
    }
}
