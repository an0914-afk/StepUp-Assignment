// Problem 12 : Find Power of a Number using For Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number and Power
        System.out.print("Enter the base number  : ");
        int number = input.nextInt();

        System.out.print("Enter the power        : ");
        int power = input.nextInt();

        // Check if both number and power are Positive Integers
        if (number > 0 && power > 0) {

            // Initialize result to 1
            // result will store the final power value
            long result = 1;

            // For Loop - Multiply number by itself power times
            // Initialization : i = 1
            // Condition       : i <= power
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i <= power; i++) {

                // Multiply result by number in each iteration
                result = result * number;
            }

            // Output - Display Power Result
            System.out.println("The result of " + number +
                               " to the power " + power  +
                               " is "           + result);

        } else {

            // Output - Number or Power is NOT a Positive Integer
            System.out.println("Please enter positive integers for number and power");
        }

        // Close Scanner
        input.close();
    }
}