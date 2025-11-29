package week08.lab.lab1;

class Electronics {
    private String name;
    private String brand;
    private double price;

    // สร้างคอนสตรัคเตอร์
    public Electronics(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.printf("%-20s%-20s%10.2f\n", name, brand, price);
    }
}