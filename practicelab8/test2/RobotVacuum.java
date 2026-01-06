package practicelab8.test2;

public class RobotVacuum extends Device implements Rechargeable {
    public RobotVacuum(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " is cleaning the floor.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(getName() + " is docking to charge station.");
    }
}
