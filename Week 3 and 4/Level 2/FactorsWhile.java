// Problem 8 : Find Factors of a Number using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // Display Factors Header
            System.out.println("\nFactors of " + number + " are:");

            // Initialize counter to 1
            int counter = 1;

            // While Loop - Iterate from 1 to number - 1
            // Loop continues as long as counter is less than number
            while (counter < number) {

                // Check if the number is perfectly divisible by counter
                // Using Modulus Operator - if remainder is 0 then counter is a factor
                if (number % counter == 0) {

                    // Output - Print the Factor
                    System.out.println(counter);
                }

                // Increment counter by 1 for next iteration
                counter++;
            }

        } else {

            // Output - Number is NOT a Natural Number
            System.out.println("The number " + number +
                               " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}