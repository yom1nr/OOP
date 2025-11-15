package week02.lab.lab4;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Enter a non-negative integer: ");
        n = scanner.nextInt();
        scanner.close();

        double part1 = Math.sqrt(2*Math.PI*n);
        double part2 = Math.pow(n/Math.E, n);
        double factorial = part1 * part2;

        System.out.printf("The factorial of %d is approximately: %.3f\n", n, factorial);

    }
}
