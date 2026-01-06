package tu1;

public class MainClass {
    public static void main(String[] args) {
        Beverage[] menu = new Beverage[2];
        menu[0] = new Coffee("Espresso", 60, "Dark Roast");
        menu[1] = new Tea("Green Tea", 50, "Iced");

        System.out.println("--- Order Summary ---");

        for (Beverage b : menu) {
            b.prepare();
            System.out.println("Price: " + b.getPrice() + " Baht");
            System.out.println("---------------------");
        }
    }
}
