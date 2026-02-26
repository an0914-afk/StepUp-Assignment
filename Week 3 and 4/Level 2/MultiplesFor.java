// Problem 11 : Find All Multiples of a Number Below 100 using For Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class MultiplesFor {
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

            // For Loop - Iterate backward from 100 to 1
            // Initialization : i = upperLimit
            // Condition       : i >= 1
            // Update          : i-- (decrement by 1 each iteration)
            for (int i = upperLimit; i >= 1; i--) {

                // Check if i is perfectly divisible by number
                // Using Modulus Operator - if remainder is 0 then i is a multiple
                if (i % number == 0) {

                    // Output - Print the Multiple and continue the loop
                    System.out.println(i);
                }
            }

        } else {

            // Output - Number is NOT valid
            System.out.println("Please enter a positive integer less than 100");
        }

        // Close Scanner
        input.close();
    }
}