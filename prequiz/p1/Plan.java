package prequiz.p1;

public class Plan extends Transport implements Flyable {

    public Plan(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Plane is taxiing on runway.");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying high at " + getSpeed() + " km/h!");
    }

}
