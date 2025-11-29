package Quiz.Test1;

import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int s = sc.nextInt();

        System.out.println("Please enter " + s + " numbers:");
        int n[] = new int[s];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        System.out.println("Array data = " + Arrays.toString(n));

        int sum = 0;
        int max = n[0];
        int min = n[0];
        for (int j : n) {
            if (j > max) {
                max = j;
            } else {
                min = j;
            }
        }

        sum = min - max;
        System.out.println("minus = " + sum);
        System.out.println("max = " + max);
    }
}
