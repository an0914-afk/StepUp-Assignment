// Problem 10 : Find Greatest Factor of a Number using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // Initialize greatestFactor to 1
            // 1 is always a factor of any number
            int greatestFactor = 1;

            // Initialize counter to number - 1
            // Start from last but one to find greatest factor
            int counter = number - 1;

            // While Loop - Iterate from number - 1 down to 1
            // Loop continues as long as counter is >= 1
            while (counter >= 1) {

                // Check if the number is perfectly divisible by counter
                // Using Modulus Operator - if remainder is 0 then counter is a factor
                if (number % counter == 0) {

                    // Assign counter to greatestFactor
                    greatestFactor = counter;

                    // Break the loop - Greatest Factor Found
                    break;
                }

                // Decrement counter by 1 for next iteration
                counter--;
            }

            // Output - Display Greatest Factor outside the loop
            System.out.println("The greatest factor of " + number +
                               " beside itself is "      + greatestFactor);

        } else {

            // Output - Number is NOT a Natural Number
            System.out.println("The number " + number +
                               " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}