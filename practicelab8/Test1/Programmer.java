package practicelab8.Test1;

public class Programmer extends Employee {
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void Work() {
        System.out.println(getName() + " is coding Java application.");
    }
}
