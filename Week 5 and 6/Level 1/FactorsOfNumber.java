// Problem 8 : Find Factors of a Number and Store in Array
// Author: Aaditya
// Date: 15.03.26

// Create a program to find the factors of a number taken as user
// input, store the factors in an array, and display the factors
// Array is dynamically resized if more space is needed

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Initialize maxFactor to 10
            // This is the initial size of the factors array
            int maxFactor = 10;

            // Create integer array to store factors
            int[] factors = new int[maxFactor];

            // Index variable to reflect the index of the array
            int index = 0;

            // For Loop - Find all factors from 1 to the number
            // Initialization : i = 1
            // Condition       : i <= number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i <= number; i++) {

                // Check if the number is perfectly divisible by i
                // Using Modulus Operator - if remainder is 0 then i is a factor
                if (number % i == 0) {

                    // Check if the index is equal to maxFactor
                    // If so, need to resize the factors array
                    if (index == maxFactor) {

                        // Reset the maxFactor to twice its size
                        maxFactor = maxFactor * 2;

                        // Use temp array to store elements from factors array
                        int[] temp = new int[maxFactor];

                        // Copy elements from factors array to temp array
                        for (int j = 0; j < factors.length; j++) {
                            temp[j] = factors[j];
                        }

                        // Assign the factors array to the temp array
                        factors = temp;
                    }

                    // Add the factor to the array element
                    factors[index] = i;

                    // Increment the index
                    index++;
                }
            }

            // Display the Factors of the Number
            System.out.println();
            System.out.println("Factors of " + number + " :");
            System.out.println("=".repeat(40));

            // For Loop - Display each factor
            for (int i = 0; i < index; i++) {

                // Print each factor separated by space
                System.out.print(factors[i] + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Total number of factors : " + index);

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}