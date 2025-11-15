package week03.lab.lab3;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.printf("%d is a positive number.\n", number);
            if (number % 3 == 0) {
                System.out.printf("%d is divisible by 3.\n", number);
            }else {
                System.out.printf("%d is not divisible by 3.\n", number);
            }
        }else if (number < 0) {
            System.out.printf("%d is a negative number.\n", number);
        }
        else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}
