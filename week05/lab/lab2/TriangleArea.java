package week05.lab.lab2;

import java.util.Scanner;

public class TriangleArea {
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public void displayArea(double base, double height) {
        double area = calculateArea(base, height);
        System.out.printf("Area of triangle with base %.2f and height %.2f is: %.2f\n", base, height, area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleArea triangleArea = new TriangleArea();

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        triangleArea.displayArea(base, height);
        sc.close();
    }
}
