package week05.lab.lab4;

import java.util.Scanner;

public class ShapeArea {

    public double calculateArea(int length, int width) {
        return (double) length * width;
    }

    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea sa = new ShapeArea();

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice (1/2): ");
        int choice = sc.nextInt();

        double area;
        if (choice == 1) {
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter width: ");
            int width = sc.nextInt();
            area = sa.calculateArea(length, width);
        } else if (choice == 2) {
            System.out.print("Enter radius: ");
            int radius = sc.nextInt();
            area = sa.calculateArea(radius);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("The area is: " + area);
        sc.close();
    }
}
