package week09.lab.lab2;

public class MainClass {
    public static void main(String[] args) {
        Food food = new Food("Pizza", 250.0);
        Electronics electronics = new Electronics("Smartphone", 15000.0);
        Clothing clothing = new Clothing("T-Shirt", 500.0);

        Taxable[] products = { food, electronics, clothing };

        System.out.println("Product Details:");

        for (Taxable product : products) {
            if (product instanceof Food) {
                Food item = (Food) product;
                System.out.println("Name: " + item.getName());
                System.out.println("Price (Before Tax): " + item.getPrice());
            } else if (product instanceof Electronics) {
                Electronics item = (Electronics) product;
                System.out.println("Name: " + item.getName());
                System.out.println("Price (Before Tax): " + item.getPrice());
            } else if (product instanceof Clothing) {
                Clothing item = (Clothing) product;
                System.out.println("Name: " + item.getName());
                System.out.println("Price (Before Tax): " + item.getPrice());
            }

            System.out.println("Tax (7%): " + String.format("%.2f",
                    product.calculateTax()));
            System.out.println("Price (After Tax): " + String.format("%.2f",
                    product.calculateTotalPrice()));
            System.out.println();
        }
    }
}
