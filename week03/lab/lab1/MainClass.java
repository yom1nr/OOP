package week03.lab.lab1;

public class MainClass {
    public static void main(String[] args) {
        int a = 5;
        if (a < 0) {
            System.out.println("The number is negative.");
        }
        else if (Math.abs(a)%2 == 1 && a != 0) {
            System.out.println("Condition2: a is an odd number");
        }
    }
}