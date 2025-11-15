package B6729875_LabTest1.LabTest2_02;

import java.util.*;

public class PersonalLoanChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        int monthly = sc.nextInt();

        System.out.print("Enter credit bureau: ");
        int credit = sc.nextInt();

        System.out.print("Enter nationality (th for Thai, Fg for Foreigner): ");
        String national = sc.next();

        String nationCode = national.toUpperCase();

        if (age < 20) {
            System.out.println("Loan denied due to age restriction. (" + nationCode + ")");
        } else if (credit >= 24) {
            System.out.println("Loan denied due to high credit bureau. (" + nationCode + ")");
        } else if (national.equalsIgnoreCase("th")) {
            if (monthly >= 15000) {
                System.out.println("Loan Approved for Thai applicant. (TH)");
            } else {
                System.out.println("Loan denied due to insufficient income. (TH)");
            }
        } else if (national.equalsIgnoreCase("fg")) {
            if (monthly >= 30000) {
                System.out.println("Loan Approved for Foreigner applicant. (FG)");
            } else {
                System.out.println("Loan denied due to insufficient income. (FG)");
            }
        } else {
            System.out.println("Loan denied due to invalid nationality.");
        }
        sc.close();
    }
}