package prequiz.p1;

public class MainClass {
    public static void main(String[] args) {
        Transport[] transports = new Transport[2];
        transports[0] = new Car(120);
        transports[1] = new Plan(800);

        for (Transport t : transports) {
            t.move();
            if (t instanceof Flyable) {
                ((Flyable) t).fly();
            }
            System.out.println("---------------------");
        }
    }
}
