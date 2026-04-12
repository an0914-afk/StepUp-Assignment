// Program to calculate wind chill temperature
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner;
 
public class WindChillCalculator {
    
    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Formula: windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * windSpeed^0.16
        double windChill = 35.74 + 0.6215 * temperature + 
                          (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        
        return windChill;
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Create object of WindChillCalculator
        WindChillCalculator calculator = new WindChillCalculator();
        
        // Take User Input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();
        
        // Calculate Wind Chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        
        // Display Result
        System.out.printf("\nWind Chill Temperature: %.2f�F%n", windChill);
        
        // Close Scanner
        input.close();
    }
}