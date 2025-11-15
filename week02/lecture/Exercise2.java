package week02.lecture;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight;
        double height;

        System.out.print("Input your nickname: ");
        String nickname = scanner.nextLine();
        System.out.print("Input your weight(kg): ");
        weight = scanner.nextInt();
        System.out.print("Input your height(m.): ");
        height = scanner.nextDouble();
        scanner.close();

        double bmi = weight / (height * height);
        System.out.printf("%s, your BMI is: %.3f%n", nickname, bmi);
    }
}