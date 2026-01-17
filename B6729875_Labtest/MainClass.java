package B6729875_Labtest;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of employees: ");
            int numEmployees = sc.nextInt();
            sc.nextLine();

            Employee[] employees = new Employee[numEmployees];

            for (int i = 0; i < numEmployees; i++) {
                System.out.println("\nEntering data for employee " + (i + 1) + ":");

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter position: ");
                String position = sc.nextLine();

                System.out.print("Is this employee a manager? (yes/no): ");
                String isManager = sc.nextLine();

                if (isManager.equals("yes")) {
                    System.out.print("Enter team size: ");
                    int teamSize = sc.nextInt();
                    sc.nextLine();

                    employees[i] = new Manager(name, position, teamSize);
                } else {
                    employees[i] = new Employee(name, position);
                }
            }

            System.out.println("\nAll Employee Information:");
            if (numEmployees == 0) {
                System.out.println("(No employees to display)");
            } else {
                for (Employee emp : employees) {
                    if (emp != null) {
                        emp.displayInfo();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("\nInvalid input. Please enter a valid number or decimal.");
        }
        sc.close();
    }
}