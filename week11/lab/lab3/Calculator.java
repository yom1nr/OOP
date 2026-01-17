package week11.lab.lab3;

public class Calculator {
    private String name;

    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double divide(double n1, double n2) {
        if (n2 == 0)
            throw new ArithmeticException("Division by zero");
        return n1 / n2;
    }
}
