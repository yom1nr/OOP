package week03.lecture; 
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name:");
        String fullName = sc.nextLine();

        System.out.print("Enter grade:");
        Character grade = sc.nextLine().charAt(0);
        sc.close();

        System.out.print(fullName);
        System.out.println(", Grade:"+ grade);
    }
}