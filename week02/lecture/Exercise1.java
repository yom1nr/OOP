package week02.lecture;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your major: ");
        String major = scanner.next();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        scanner.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major : " + major);
        System.out.printf("GPA: %.2f%n", gpa);
    }
}