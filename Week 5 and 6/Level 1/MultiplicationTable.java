// Problem 3 : Multiplication Table of a Number
// Author: Aaditya
// Date: 15.03.26

// Create a program to print a multiplication table of a number
// Store the results in an array and display in format number * i = ___

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Multiplication Range
        int range = 10;

        // Take User Input for Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Define an integer array to store the results of
        // multiplication from 1 to 10
        int[] results = new int[range];

        // For Loop - Calculate multiplication table from 1 to 10
        // Initialization : i = 1
        // Condition       : i <= range
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 1; i <= range; i++) {

            // Store the multiplication result in the array
            // Array index starts from 0, so use i - 1
            results[i - 1] = number * i;
        }

        // Display the Multiplication Table
        System.out.println();
        System.out.println("Multiplication Table of " + number + " :");
        System.out.println("=".repeat(40));

        // For Loop - Display results from the array
        // Initialization : i = 1
        // Condition       : i <= range
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 1; i <= range; i++) {

            // Display in format : number * i = result
            System.out.println(number + " * " + i +
                               " = " + results[i - 1]);
        }

        // Close Scanner
        input.close();
    }
}