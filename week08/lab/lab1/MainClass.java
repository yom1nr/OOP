package week08.lab.lab1;

public class MainClass {
    public static void main(String[] args) {
        Electronics[] items = new Electronics[3];
        // Initialize items array
        items[0] = new Electronics("iPhone 14 Pro", "Apple", 1099.99);
        items[1] = new Electronics("Galaxy S22", "Samsung", 0.0);
        items[1].setPrice(899.99);
        items[2] = new Electronics("", "", 0.0);
        items[2].setName("MacBook Air");
        items[2].setBrand("Apple");
        items[2].setPrice(1249.99);

        // Display table header
        String name = "Product Name";
        String brand = "Brand";
        String price = "Price (USD)";
        System.out.printf("%-20s%-20s%10s\n", name, brand, price);
        System.out.println("---------------------------------------------");

        // Display item details
        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
        }
    }
}
