package week08.quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberOperations sqr = new NumberOperations();

        System.out.print("Please enter an integer: ");
        int n = sc.nextInt();

        System.out.printf("The square root of |%d| = %.2f\n", n, (sqr.calculateSquareRoot(n)));

        sqr.checkNumber(n);

    }
}
