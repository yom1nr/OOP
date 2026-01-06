package tu1;

public class Tea extends Beverage {
    String type;

    public Tea(String name, int price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("Steeping " + getName() + " (" + type + ") in hot water...");
    }
}
