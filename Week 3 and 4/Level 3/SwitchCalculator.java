// Problem 8 : Calculator using Switch Case
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for First Number
        System.out.print("Enter the first number         : ");
        double first = input.nextDouble();

        // Take User Input for Second Number
        System.out.print("Enter the second number        : ");
        double second = input.nextDouble();

        // Take User Input for Operator
        // Operator can only be one of: +, -, *, /
        System.out.print("Enter an operator (+, -, *, /) : ");
        String op = input.next();

        // Initialize result to 0
        double result = 0;

        // Switch Case - Perform Operation based on Operator
        switch (op) {

            // Case + : Addition
            case "+":
                result = first + second;
                System.out.println(first + " + " + second +
                                   " = " + result);
                break;

            // Case - : Subtraction
            case "-":
                result = first - second;
                System.out.println(first + " - " + second +
                                   " = " + result);
                break;

            // Case * : Multiplication
            case "*":
                result = first * second;
                System.out.println(first + " * " + second +
                                   " = " + result);
                break;

            // Case / : Division
            case "/":

                // Check if second number is not zero
                // Division by zero is not allowed
                if (second != 0) {
                    result = first / second;
                    System.out.println(first + " / " + second +
                                       " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            // Default : Invalid Operator
            default:
                System.out.println("Invalid Operator. " +
                                   "Please enter one of : +, -, *, /");
                break;
        }

        // Close Scanner
        input.close();
    }
}