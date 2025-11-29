package week06.lecture;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("Honda", "Blue", 2022);

        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();
        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}
