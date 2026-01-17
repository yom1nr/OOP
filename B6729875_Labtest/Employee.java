package B6729875_Labtest;

public class Employee implements Displayable {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + " | Position: " + position);
    }
}