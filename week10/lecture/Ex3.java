package week10.lecture;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String input = sc.nextLine();

        System.out.println("Number of Letters: " + input.replaceAll("[^a-zA-Z]", "").length());
        System.out.println("Number of Digit: " + input.replaceAll("[^0-9]", "").length());

    }
}
