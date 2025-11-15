package week05.lab.lab1;

public class TaxCalculator {

    public double calculateThaiTax(double sum) {
        double taxRate = 0.07;
        return sum * taxRate;
    }

    public static double calculateUKTax(double sum) {
        double taxRate = 0.1075;
        return sum * taxRate;
    }

    public static void main(String[] args) {
        int[] prices = { 150, 200, 450 };
        double sum = 0;

        for (int price : prices) {
            sum = sum + price;
        }

        System.out.println("Sum of prices: " + sum);

        TaxCalculator calculator = new TaxCalculator();
        double thaiTax = calculator.calculateThaiTax(sum);
        System.out.println("Thai tax (7%): " + thaiTax);
        System.out.println("Total payment in Thailand: " + (sum + thaiTax));

        double ukTax = TaxCalculator.calculateUKTax(sum);
        System.out.println("UK tax (10.75%): " + ukTax);
        System.out.println("Total payment in UK: " + (sum + ukTax));
    }
}