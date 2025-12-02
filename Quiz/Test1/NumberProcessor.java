package Quiz.Test1;

import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Please enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array data = " + Arrays.toString(numbers));

        int minus = 0;
        int max = Integer.MAX_VALUE;
        boolean isFirst = true;

        for (int num : numbers) {
            if (isFirst) {
                max = num;
                minus = num;
                isFirst = false;
            } else {
                minus -= num;
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("minus = " + minus);
        System.out.println("max = " + max);

        scanner.close();
    }
}
