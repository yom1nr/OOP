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

        System.out.printf("Sum: %d%n", mathOps.add(num1, num2));
        System.out.printf("Difference: %d%n", mathOps.subtract(num1, num2));
        System.out.printf("Product: %d%n", mathOps.multiply(num1, num2));
        System.out.printf("Quotient: %.1f%n", mathOps.divide(num1, num2));

        scanner.close();
    }
}
