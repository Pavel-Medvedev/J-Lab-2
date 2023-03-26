package org.example;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Input 9 coordinates for 3 3d points:");
        Scanner sc = new Scanner(System.in);
        Point3d point1 = new Point3d(inputDouble(sc), inputDouble(sc), inputDouble(sc)),
                point2 = new Point3d(inputDouble(sc), inputDouble(sc), inputDouble(sc)),
                point3 = new Point3d(inputDouble(sc), inputDouble(sc), inputDouble(sc));
        sc.close();
        printArea(point1, point2, point3);
    }
    private static double inputDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("The inputed data is incorrect!\nPlease input correct data!");
            sc.next();
        }
        return sc.nextDouble();
    }
    private static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double temp = Math.max(point3.distanceTo(point1), Math.max(point2.distanceTo(point3), point1.distanceTo(point2)));
        if (point1.distanceTo(point2) + point1.distanceTo(point3) + point2.distanceTo(point3) - temp > temp) {
            double a = point1.distanceTo(point2), b = point2.distanceTo(point3), c = point3.distanceTo(point1),
                    p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }
    private static void printArea(Point3d point1, Point3d point2, Point3d point3) {
        double result = computeArea(point1, point2, point3);
        if (result == 0)
            System.out.println("This points couldn't provide the triangle creation!");
        else
            System.out.println(String.format("The area of triangle created by you'r 3 points is: %.2f", result));
    }
}