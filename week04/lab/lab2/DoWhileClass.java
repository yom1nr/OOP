package week04.lab.lab2;
import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0; 
        int number; 

        System.out.println("Enter scores (0-100). Enter a number outside this range to stop:");
        do {
            number = scanner.nextInt();

            if (number >= 0 && number <= 100) {
                sum += number;
                count++;        
            }
        } while (number >= 0 && number <= 100);
        
        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average score: %.2f\n", average);
        } else {
            System.out.println("No valid scores were entered.");
        }
    }
}