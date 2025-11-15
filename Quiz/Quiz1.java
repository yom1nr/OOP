package Quiz;
import java.util.*;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double bmi, kg, m ;

        System.out.print("Enter your weight (kg): ");
        kg = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        m = sc.nextDouble();

        bmi = kg/(m*m);

        System.out.printf("Your BMI is: %.2f\n",bmi);
        if (bmi >= 30 ) {
            System.out.println("Result: Obesity");
        }else if (bmi >= 25 ) {
            System.out.println("Result: Overweight");
        }else if (bmi >= 18.5 ) {
            System.out.println("Result: Normal weight");
        }else {
            System.out.println("Result: Underweight");
        }
        sc.close();
    }
}
