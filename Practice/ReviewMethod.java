package Practice;

import java.util.*;

public class ReviewMethod {
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public void displayArea(double base, double height) {
        double area = calculateArea(base, height);
        System.out.printf("Area of triangle is: %.2f", area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReviewMethod triangle = new ReviewMethod();

        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        triangle.displayArea(base, height);
        sc.close();

    }
}
