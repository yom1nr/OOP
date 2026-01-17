package LabTest3_01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, department;
        double salary;

        System.out.print("Enter Employee ID: ");
        id = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee Department: ");
        department = sc.nextLine();
        System.out.print("Enter Employeee Salary: ");
        salary = sc.nextDouble();

        Employee employee = new Employee(id, department, name, salary);
        employee.printDetails();

        sc.close();
    }
}
