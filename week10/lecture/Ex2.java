package week10.lecture;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Convert character to integer and add to sum
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("Summation of numbers within string is: " + sum);
        sc.close();
    }
}