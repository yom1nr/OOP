package week04.lecture;
import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 1;

        System.out.print("Enter non-negative integer: ");
        n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
        }else if (n == 0) {
            System.out.println("The factorial of 0 is: 1");

        }else {
            System.out.println("Factorial is not defined for negative number.");
        }
        System.out.println("The factorial of "+n+" is: "+sum);
        
        sc.close();

    }
}
