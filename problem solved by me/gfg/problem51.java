/*Given coordinates of 2 points on a cartesian plane, find the distance between them rounded up to nearest integer. */

import java.util.Scanner;

public class problem51 {
    public static int distanceBetweenPoints(int x1, int y1, int x2, int y2) {
        // Calculate the differences in x and y coordinates
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        // Calculate the Euclidean distance
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        // Round up to the nearest integer and return
        return (int) Math.ceil(distance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the first point
        System.out.println("Enter coordinates of the first point (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        // Read the coordinates of the second point
        System.out.println("Enter coordinates of the second point (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Compute and print the rounded distance
        int roundedDistance = distanceBetweenPoints(x1, y1, x2, y2);
        System.out.println("The distance between the points rounded up to the nearest integer is: " + roundedDistance);

        scanner.close();

    }
}
