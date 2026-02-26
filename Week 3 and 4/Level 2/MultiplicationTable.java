// Problem 3 : Find Multiplication Table of a Number from 6 to 9
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Fixed Values - Start and End of Multiplication Table
        int tableStart = 6;   // Start from 6
        int tableEnd   = 9;   // End at 9

        // Display Multiplication Table Header
        System.out.println("\nMultiplication Table of " + number +
                           " from " + tableStart + " to " + tableEnd + ":");

        // For Loop - Iterate from tableStart to tableEnd
        // Initialization : i = tableStart
        // Condition       : i <= tableEnd
        // Update          : i++ (increment by 1 each iteration)
        for (int i = tableStart; i <= tableEnd; i++) {

            // Calculate Product
            int product = number * i;

            // Output - Print Multiplication Table in format number * i = product
            System.out.println(number + " * " + i + " = " + product);
        }

        // Close Scanner
        input.close();
    }
}