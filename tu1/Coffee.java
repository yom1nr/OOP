package tu1;

public class Coffee extends Beverage {
    private String roastLevel;

    public Coffee(String name, int price, String roastLevel) {
        super(name, price);
        this.roastLevel = roastLevel;
    }

    @Override
    public void prepare() {
        System.out.println("Grinding " + roastLevel + " beans and brewing " + getName() + "...");
    }
}
