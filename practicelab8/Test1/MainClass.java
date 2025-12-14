package practicelab8.Test1;

public class MainClass {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Somchai", 15000);
        staff[1] = new Programmer("Somsri", 30000);
        staff[2] = new Manager("Somboon", 50000);

        for (Employee e : staff) {
            e.Work();
        }
    }
}
