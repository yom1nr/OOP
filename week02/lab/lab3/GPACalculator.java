package week02.lab.lab3;
import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students who got A: ");
        int numA = scanner.nextInt();
        System.out.print("Enter the number of students who got B: ");
        int numB = scanner.nextInt();
        System.out.print("Enter the number of students who got C: ");   
        int numC = scanner.nextInt();
        System.out.print("Enter the number of students who got D: ");
        int numD = scanner.nextInt();
        System.out.print("Enter the number of students who got F: ");
        int numF = scanner.nextInt();
        scanner.close();

        int totalStudents = numA + numB + numC + numD + numF;
        double gpa = (4.0 * numA + 3.0 * numB + 2.0 * numC + 1.0 * numD + 0.0 * numF) / totalStudents;

        System.out.printf("The average GPA is: %.2f%n", gpa);
    }
}