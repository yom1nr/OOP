package LabTest1_01;

import java.util.*;

public class BSACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kg, cm, area, s;

        System.out.print("Enter weight (kg): ");
        kg = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        cm = sc.nextDouble();

        s = 0.0003207 * (Math.pow(cm, 0.3)) * (Math.pow(kg, 0.7285 - (0.0188 * (Math.log10(kg)))));

        System.out.printf("Body Surface Area (square meters): 00%.4f", s);
        sc.close();
    }
}