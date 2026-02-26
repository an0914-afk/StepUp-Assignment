// Problem 14 : Find Power of a Number using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class PowerWhile {
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

            // Initialize counter to 0
            // counter tracks the number of multiplications done
            int counter = 0;

            // While Loop - Multiply number by itself power times
            // Loop continues as long as counter is not equal to power
            while (counter != power) {

                // Multiply result by number in each iteration
                result = result * number;

                // Increment counter by 1 for next iteration
                counter++;
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