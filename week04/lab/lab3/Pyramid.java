package week04.lab.lab3;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {            
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}