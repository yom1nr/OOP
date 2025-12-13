package week11.lab.lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 2, 4, 0, 8, 10 };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            System.out.println(arr1[num1] + " * " + arr2[num2] + " = " + (arr1[num1] * arr2[num2]));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e);
            System.out.println("The entered number exceeds the array size.");

        } catch (InputMismatchException e) {
            System.out.println("An exception occurred: " + e);
            System.out.println("The input must be an integer.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
