// Problem 7 : Separate Odd and Even Numbers into Arrays
// Author: Aaditya
// Date: 15.03.26

// Create a program to save odd and even numbers into odd and even
// arrays between 1 to the number entered by the user.
// Finally, print the odd and even numbers array

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check for Natural Number
        // If not a natural number then print an error and exit
        if (number <= 0) {

            // Output - Error Message
            System.out.println("Error : Please enter a positive " +
                               "natural number greater than 0");

        } else {

            // Create integer arrays for even and odd numbers
            // Size = number / 2 + 1 (to handle all cases)
            int[] evenNumbers = new int[number / 2 + 1];
            int[] oddNumbers  = new int[number / 2 + 1];

            // Create index variables for odd and even numbers
            // Initialize them to zero
            int evenIndex = 0;
            int oddIndex  = 0;

            // For Loop - Iterate from 1 to the number
            // Initialization : i = 1
            // Condition       : i <= number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i <= number; i++) {

                // Check if the number is even or odd
                // Using Modulus Operator - if remainder is 0 then Even
                if (i % 2 == 0) {

                    // Save the even number into the even array
                    evenNumbers[evenIndex] = i;

                    // Increment even index
                    evenIndex++;

                } else {

                    // Save the odd number into the odd array
                    oddNumbers[oddIndex] = i;

                    // Increment odd index
                    oddIndex++;
                }
            }

            // Display Even Numbers Array
            System.out.println();
            System.out.println("Even Numbers from 1 to " + number + " :");
            System.out.println("=".repeat(40));

            // For Loop - Print even numbers using evenIndex
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i] + " ");
            }
            System.out.println();

            // Display Odd Numbers Array
            System.out.println();
            System.out.println("Odd Numbers from 1 to " + number + " :");
            System.out.println("=".repeat(40));

            // For Loop - Print odd numbers using oddIndex
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i] + " ");
            }
            System.out.println();
        }

        // Close Scanner
        input.close();
    }
}