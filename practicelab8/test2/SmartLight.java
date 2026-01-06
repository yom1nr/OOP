package practicelab8.test2;

public class SmartLight extends Device {
    public SmartLight(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " is lighting up the room.");
    }
}
