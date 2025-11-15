package week03.lecture;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Input your budget = ");
        int budget = sc.nextInt();
        sc.close();

        if (budget >= 0 && budget <= 500) {
            System.out.printf("your budget = %,d, you can buy keyboard.\n", budget);
        } else if (budget <= 1000) {
            System.out.printf("your budget = %,d, you can buy Mouse.\n", budget);
        } else if (budget <= 2000) {
            System.out.printf("your budget = %,d, you can buy Router.\n", budget);
        } else if (budget <= 10000) {
            System.out.printf("your budget = %,d, you can buy Monitor.\n", budget);
        } else {
            System.out.printf("your budget = %,d ,you can buy Graphic Card.\n", budget);
        }
    }
}