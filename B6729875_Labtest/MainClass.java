package B6729875_Labtest;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of employees: ");
            int numberOfEmployees = scanner.nextInt();
            scanner.nextLine();

            Employee[] employees = new Employee[numberOfEmployees];

            for (int i = 0; i < numberOfEmployees; i++) {
                System.out.println("\nEntering data for employee " + (i + 1) + ":");

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter position: ");
                String position = scanner.nextLine();

                System.out.print("Is this employee a manager? (yes/no): ");
                String isManager = scanner.nextLine();

                if (isManager.equalsIgnoreCase("yes")) {
                    System.out.print("Enter team size: ");
                    int teamSize = scanner.nextInt();
                    scanner.nextLine();

                    employees[i] = new Manager(name, position, teamSize);
                } else {
                    employees[i] = new Employee(name, position);
                }
            }

            System.out.println("\nAll Employee Information:");
            if (numberOfEmployees == 0) {
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
        scanner.close();
    }
}