package week06.lab.lab2;

public class Main {
    public static void main(String[] args) {
        ElectricityBill aliceBill = new ElectricityBill("Alice", 40);
        ElectricityBill bobBill = new ElectricityBill("Bob", 120);

        aliceBill.displayDetails();
        System.out.println("------------------------");
        bobBill.displayDetails();
    }
}