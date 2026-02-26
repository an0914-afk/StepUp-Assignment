// Problem 13 : Find All Multiples of a Number Below 100 using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Upper Limit
        int upperLimit = 100;

        // Take User Input for Number
        System.out.print("Enter a positive integer less than 100 : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number and less than 100
        if (number > 0 && number < upperLimit) {

            // Display Multiples Header
            System.out.println("\nMultiples of " + number + " below 100 are:");

            // Initialize counter to upperLimit
            // Start from 100 and go backward
            int counter = upperLimit;

            // While Loop - Iterate backward from 100 to 1
            // Loop continues as long as counter is > 1
            while (counter > 1) {

                // Check if counter is perfectly divisible by number
                // Using Modulus Operator - if remainder is 0 then multiple found
                if (counter % number == 0) {

                    // Output - Print the Multiple
                    System.out.println(counter);
                }

                // Decrement counter by 1 for next iteration
                counter--;
            }

        } else {

            // Output - Number is NOT valid
            System.out.println("Please enter a positive integer less than 100");
        }

        // Close Scanner
        input.close();
    }
}