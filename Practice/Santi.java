package Practice;
import java.util.*;

public class Santi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n ;

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        if (n > 0) {
            System.out.printf("%d is a positive number.\n",n);

            if (n%3 == 0 )  {
                System.out.printf("%d is divisible by 3.\n",n);
            }else {
                System.out.printf("%d is not divisible by 3.\n",n);
            }
        } else if (n < 0) {
            System.out.printf("%d is a negative number.\n",n);

        }else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}