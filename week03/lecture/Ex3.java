package week03.lecture;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.printf("%d is an even number.\n", n);
            if (n % 4 == 0) {
                System.out.printf("%d is divisible by 4.\n", n);
            } else {
                System.out.printf("%d is not divisible by 4.\n", n);
            }
        } else {
            System.out.printf("%d is an odd number.\n", n);
        }
    }
}