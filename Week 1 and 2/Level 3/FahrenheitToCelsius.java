// Program to Convert Temperature from Fahrenheit to Celsius
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        // Formula: (°F - 32) x 5/9 = °C
        // Operator Precedence: Subtraction in brackets first then Multiplication
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9;

        // Output
        System.out.println("The " + fahrenheit +
                           " fahrenheit is " + celsiusResult +
                           " celsius");

        // Close Scanner
        input.close();
    }
}