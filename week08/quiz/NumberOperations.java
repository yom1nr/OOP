package week08.quiz;

public class NumberOperations {
    public double calculateSquareRoot(int n) {
        return Math.sqrt(Math.abs(n));
    }

    public void checkNumber(int n) {
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
