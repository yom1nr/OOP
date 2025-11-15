package week03.lecture;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your budget = ");
        int budget = sc.nextInt();
        sc.close();

        if (budget >= 25000) {
            System.out.printf("your budget = %,d, you can buy it.\n", budget);
        }
    }
}