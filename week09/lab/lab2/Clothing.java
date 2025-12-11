package week09.lab.lab2;

public class Clothing implements Taxable {
    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculateTax() {
        return price * 0.07;
    }

    @Override
    public double calculateTotalPrice() {
        return price + calculateTax();
    }
}