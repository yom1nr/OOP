package Quiz;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            double volume = length * width * height;
            System.out.printf("Volume of the box is: %.2f\n", volume);

            System.out.print("Do you want to calculate another box volume? (true/false): ");
            shouldContinue = sc.nextBoolean();
        }
        sc.close();

        System.out.println(shouldContinue);
    }
}
