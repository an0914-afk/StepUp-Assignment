// Problem 4 : Check if a Number is an Armstrong Number
// Author: Aaditya
// Date: 23.02.26

// Armstrong Number is a number whose Sum of cubes of each digit
// results in the original number
// e.g. 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Initialize sum to 0
            // sum will store the sum of cubes of each digit
            int sum = 0;

            // Store the original number for comparison at the end
            int originalNumber = number;

            // While Loop - Extract each digit and find its cube
            // Loop continues as long as originalNumber is not equal to 0
            while (originalNumber != 0) {

                // Step 1 : Find the last digit using Modulus Operator
                // digit = originalNumber % 10
                int digit = originalNumber % 10;

                // Step 2 : Find the cube of the digit
                // cube = digit * digit * digit
                int cube = digit * digit * digit;

                // Step 3 : Add cube to sum
                sum = sum + cube;

                // Step 4 : Remove the last digit using Division Operator
                // originalNumber = originalNumber / 10
                originalNumber = originalNumber / 10;
            }

            // Check if the number and sum are the same
            // If same, the number is an Armstrong Number
            if (number == sum) {

                // Output - Number is an Armstrong Number
                System.out.println("The number " + number +
                                   " is an Armstrong Number");

            } else {

                // Output - Number is NOT an Armstrong Number
                System.out.println("The number " + number +
                                   " is not an Armstrong Number");
            }

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}