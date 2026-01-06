package practicelab8.test2;

public class MainClass {
    public static void main(String[] args) {
        Device[] devices = new Device[2];
        devices[0] = new RobotVacuum("Robo-Clean");
        devices[1] = new SmartLight("Living Room Light");

        System.out.println("--- Starting Devices ---");
        for (Device d : devices) {
            d.turnOn();

            if (d instanceof RobotVacuum) {
                ((RobotVacuum) d).chargeBattery();
            }
        }
    }
}