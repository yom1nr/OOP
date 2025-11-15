package week04.lecture;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count= 0;
        String choice ;
        do {
            System.out.print("Enter the first and secound number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            sum += a+b;
            System.out.printf("The sum of %d and %d is: %d\n",a,b,sum);

            System.out.print("Do you want to preform the operation again? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes")); 
            
        sc.close();
    }
}
