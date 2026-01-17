package B6729875_Labtest;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String position, int teamSize) {
        super(name, position);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void displayInfo() {
        // Matches the output format: "Name: Bob | Position: Team Lead | Team Size: 5"
        System.out.println("Name: " + getName() + " | Position: " + getPosition() + " | Team Size: " + teamSize);
    }
}