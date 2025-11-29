package week06.lab.lab2;

public class ElectricityBill {
    private String customerName;
    private int units;

    public ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    public double calculateBill() {
        if (units <= 50) {
            return units * 2.0;
        } else if (units <= 100) {
            return (50 * 2.0) + ((units - 50) * 3.0);
        } else {
            return (50 * 2.0) + (50 * 3.0) + ((units - 100) * 5.0);
        }
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + calculateBill() + " THB");
    }
}
