package week05.lab.lab3;

import java.util.Scanner;

public class MathOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + mathOps.add(num1, num2));
        System.out.println("Difference: " + mathOps.subtract(num1, num2));
        System.out.println("Product: " + mathOps.multiply(num1, num2));
        System.out.println("Quotient: " + mathOps.divide(num1, num2));

        scanner.close();
    }
}
