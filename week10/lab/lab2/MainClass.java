package week10.lab.lab2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Smith", new JobInfo("Manager", "Sales and Marketing", "pass123"));
        employees[1] = new Employee("Jane Doe", new JobInfo("Developer", "Research and Development", "secure456"));
        employees[2] = new Employee("Alice Wonderland", new JobInfo("Analyst", "Finance and Accounting", "key789"));
        Scanner sc = new Scanner(System.in);
        for (Employee e : employees) {
            e.verifyUser(sc);
            System.out.println();
        }
        sc.close();
    }
}