// Program to Convert Temperature from Celsius to Fahrenheit
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Temperature in Celsius
        System.out.print("Enter the temperature in Celsius : ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        // Formula: (°C × 9/5) + 32 = °F
        // Operator Precedence: Multiplication first then Addition
        double fahrenheitResult = (celsius * 9.0 / 5) + 32;

        // Output
        System.out.println("The " + celsius +
                           " celsius is " + fahrenheitResult +
                           " fahrenheit");

        // Close Scanner
        input.close();
    }
}