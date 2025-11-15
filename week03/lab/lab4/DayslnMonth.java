package week03.lab.lab4;

import java.util.Scanner;

public class DayslnMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the year (BE): ");
        int yearBE = scanner.nextInt(); 
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt(); 
        scanner.close();
        
        int yearAD = yearBE - 543;
        
        boolean isLeap = ((yearAD % 4 == 0) && (yearAD % 100 != 0)) || (yearAD % 400 == 0);
        
        int days = 0;
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeap) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month entered.");
                return;
        }
        
        System.out.println("The year " + yearBE + " in B.E. is equivalent to " + yearAD + " in A.D.");
        System.out.println("The number of days in month " + month + " of year " + yearBE + " is: " + days);
    }
}