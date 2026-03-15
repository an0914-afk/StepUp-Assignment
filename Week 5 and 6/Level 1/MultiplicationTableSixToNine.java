// Problem 5 : Multiplication Table of a Number from 6 to 9
// Author: Aaditya
// Date: 15.03.26

// Create a program to find the multiplication table of a number
// entered by the user from 6 to 9 and display the result

import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Values - Range Start and End
        int rangeStart = 6;
        int rangeEnd   = 9;

        // Calculate the number of elements in the range
        int rangeSize = rangeEnd - rangeStart + 1;

        // Take User Input for Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Define an integer array to store the multiplication result
        // Size is 4 (for multipliers 6, 7, 8, 9)
        int[] multiplicationResult = new int[rangeSize];

        // For Loop - Find the multiplication table from 6 to 9
        // Initialization : i = rangeStart (6)
        // Condition       : i <= rangeEnd (9)
        // Update          : i++ (increment by 1 each iteration)
        for (int i = rangeStart; i <= rangeEnd; i++) {

            // Save the result in the array
            // Array index = i - rangeStart (to start from 0)
            multiplicationResult[i - rangeStart] = number * i;
        }

        // Display the Multiplication Table
        System.out.println();
        System.out.println("Multiplication Table of " + number +
                           " (from " + rangeStart + " to " +
                           rangeEnd + ") :");
        System.out.println("=".repeat(40));

        // For Loop - Display results from the array
        // Initialization : i = rangeStart (6)
        // Condition       : i <= rangeEnd (9)
        // Update          : i++ (increment by 1 each iteration)
        for (int i = rangeStart; i <= rangeEnd; i++) {

            // Display in format : number * i = result
            System.out.println(number + " * " + i + " = " +
                               multiplicationResult[i - rangeStart]);
        }

        // Close Scanner
        input.close();
    }
}