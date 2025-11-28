package Practice;

import java.util.*;

public class ReviewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter size arrays: ");
        // int n = sc.nextInt();
        int number[] = { 10, 20, 30, 40 };
        number[3] = 100;
        // for (int i = 0; i < 4; i++) {
        // System.out.print(number[i] + " ");
        // }
        int count = 0, sum = 0;
        for (int num : number) {
            System.out.println(num);
            sum += num;
            count++;
        }
        System.out.println();
        System.out.println(number.length);
        System.out.println(sum);
        System.out.println(count);
    }
}
