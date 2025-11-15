package week03.lab.lab2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        System.out.print("Enter the unit to convert to (kelvin/fahrenheit/rankine):");
        String unit = scanner.next();
        
        unit = unit.toLowerCase();
        
        double cTemperature = 0;
        
        if (unit.equals("kelvin")) {
            cTemperature = celsius + 273.15;
            System.out.printf("Temperature in Kelvin: %.2f\n", cTemperature);
            
        } else if (unit.equals("fahrenheit")) {
            cTemperature = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f\n", cTemperature);
            
        } else if (unit.equals("rankine")) { 
            cTemperature = (celsius + 273.15) * 9.0 / 5.0;
            System.out.printf("Temperature in Rankine: %.2f\n", cTemperature);
            
        } else {
            System.out.println("Invalid unit entered.");
        }
        
        scanner.close();
    }
}