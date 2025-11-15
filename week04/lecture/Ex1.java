package week04.lecture;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n >0) {
                System.out.println(n + " is positive");
                
            }else if (n<0) {
                System.out.println(n + " is negative");
            }else {
                System.out.println("Program exited");
                break;
            }
            
        }
        sc.close();
    }
}
