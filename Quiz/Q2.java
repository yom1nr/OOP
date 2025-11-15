package Quiz;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, result = 0 ;
        String operator ;


        System.out.print("Enter first number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        n2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next();

        if (n2 <= 0) {
            System.out.println("Error: Division by zero");
        }else {
            switch (operator) {
                case "+":
                    result = n1+n2;
                    break;
                case "-":
                    result = n1-n2;
                    break;
                case "*":
                    result = n1*n2;
                    break;
                case "/" :
                    result = n1/n2;
                    break;

                default:
                    System.out.println("Invalid operator");
                    return;
            }
            System.out.printf("Result: %.1f", result);
        }
        sc.close();
    }
}
