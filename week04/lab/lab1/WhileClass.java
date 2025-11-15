package week04.lab.lab1;

import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int countEven = 0; 
        int number = 1; 

        while (number != 0) {
            number = scanner.nextInt();

            if (number % 2 == 0 && number != 0) {
                sum += Math.abs(number); 
                countEven++;        
            }
        }
        
        scanner.close();
        
        if (countEven > 0) {
            System.out.println("Sum of even numbers: " + sum);
        } else {
            System.out.println("No even numbers were entered.");
        }
    }
}