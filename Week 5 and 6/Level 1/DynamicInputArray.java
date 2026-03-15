// Problem 4 : Store Values in Array Until 0 or Negative or Max 10
// Author: Aaditya
// Date: 15.03.26

// Write a program to store multiple values in an array up to a
// maximum of 10 or until the user enters a 0 or a negative number.
// Show all the numbers as well as the sum of all numbers

import java.util.Scanner;

public class DynamicInputArray {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Maximum Array Size
        int maxSize = 10;

        // Create a variable to store an array of 10 elements of type double
        double[] numbers = new double[maxSize];

        // Variable to store the total, initialized to 0.0
        double total = 0.0;

        // Index variable initialized to 0 for the array
        int index = 0;

        // Display Instructions
        System.out.println("Enter up to " + maxSize + " numbers.");
        System.out.println("Enter 0 or a negative number to stop.");
        System.out.println("=".repeat(50));

        // Infinite While Loop - while (true)
        // Loop continues until user enters 0 or negative
        // or array reaches maximum size
        while (true) {

            // Prompt for user entry
            System.out.print("Enter number " + (index + 1) + " : ");
            double entry = input.nextDouble();

            // Check if the user entered 0 or a negative number
            if (entry <= 0) {

                // Break out of the loop
                System.out.println("Stopping input " +
                                   "(0 or negative number entered)");
                break;
            }

            // Assign the number to the array element
            numbers[index] = entry;

            // Increment the index value
            index++;

            // Check if the index has reached the maximum array size
            if (index == maxSize) {

                // Break from the loop - array size is limited to 10
                System.out.println("Maximum array size of " +
                                   maxSize + " reached");
                break;
            }
        }

        // Display All Numbers and Calculate Sum
        System.out.println();
        System.out.println("Numbers Entered :");
        System.out.println("=".repeat(50));

        // For Loop - Get values and add to total
        // Initialization : i = 0
        // Condition       : i < index
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < index; i++) {

            // Display each number
            System.out.println("Number " + (i + 1) + " : " + numbers[i]);

            // Add to total
            total = total + numbers[i];
        }

        // Display the Total Value
        System.out.println();
        System.out.println("Sum of all numbers : " + total);

        // Close Scanner
        input.close();
    }
}