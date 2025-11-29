package LabTest2_01;

import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read array size
        System.out.print("Array size: ");
        int size = scanner.nextInt();

        // Create the array with the specified size
        int[] numbers = new int[size];

        // 2. Read values into the array (use a normal loop)
        System.out.println("Please enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display array in [x, y, z] format
        System.out.println("Array data = " + Arrays.toString(numbers));

        // 3. Calculate sequential subtraction (minus) and find maximum using for-each
        int minus = 0;
        int max = Integer.MIN_VALUE;
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

        // 4. Output results
        System.out.println("minus = " + minus);
        System.out.println("max = " + max);

        scanner.close();
    }
}
