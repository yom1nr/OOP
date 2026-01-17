package LabTest3_01;

public class Employee {
    private String name;
    private String employeeid;
    private String department;
    private double salary;

    public Employee(String name, String employeeid, String department, double salary) {
        this.name = name;
        this.employeeid = employeeid;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(String employeeid) {
        this.employeeid = employeeid;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeid;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void printDetails() {
        System.out.printf("\nEmployee Details:\n");
        System.out.println("ID: " + employeeid);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Bonus: " + calculateYearlyBonus());
    }

    public double calculateYearlyBonus() {
        return salary * 12 * 0.2;
    }
}
