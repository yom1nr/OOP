package prequiz.p1;

public class Car extends Transport {

    public Car(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Car is driving at " + getSpeed() + " km/h.");
    }
}
