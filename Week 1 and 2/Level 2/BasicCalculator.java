// Program to Create a Basic Calculator
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Two Numbers
        System.out.print("Enter the first number  : ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double number2 = input.nextDouble();

        // Perform Arithmetic Operations and Store in Variables
        double addition       = number1 + number2;
        double subtraction    = number1 - number2;
        double multiplication = number1 * number2;
        double division       = number1 / number2;

        // Output
        System.out.println("The addition, subtraction, multiplication, and division" +
                           " value of 2 numbers " + number1 + " and " + number2 +
                           " is " + addition       + ", "  +
                                    subtraction    + ", "  +
                                    multiplication + ", and " +
                                    division);

        // Close Scanner
        input.close();
    }
}