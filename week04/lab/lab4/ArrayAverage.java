package week04.lab.lab4;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close(); 
        
        double sum = 0;
        int count = 0; 
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] >= 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = sum / count;
            System.out.printf("Average of numbers: %,.3f\n", average);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}