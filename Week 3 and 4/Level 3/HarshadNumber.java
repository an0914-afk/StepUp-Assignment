// Problem 6 : Check if a Number is a Harshad Number
// Author: Aaditya
// Date: 23.02.26

// A Harshad Number is an integer which is divisible by the sum of its digits
// e.g. 21 is divisible by 3 (sum of digits: 2 + 1 = 3)

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Initialize sum to 0
            // sum will store the sum of digits of the number
            int sum = 0;

            // Store the original number for divisibility check at the end
            int originalNumber = number;

            // While Loop - Extract each digit and add to sum
            // Loop continues as long as number is not equal to 0
            while (number != 0) {

                // Find the last digit using Modulus Operator
                // digit = number % 10
                int digit = number % 10;

                // Add digit to sum
                sum = sum + digit;

                // Remove the last digit using Division Operator
                // number = number / 10
                number = number / 10;
            }

            // Check if the original number is perfectly divisible by sum
            // Using Modulus Operator - if remainder is 0 then Harshad Number
            if (originalNumber % sum == 0) {

                // Output - Number is a Harshad Number
                System.out.println("The number "      + originalNumber +
                                   " with digit sum " + sum            +
                                   " is a Harshad Number");

            } else {

                // Output - Number is NOT a Harshad Number
                System.out.println("The number "      + originalNumber +
                                   " with digit sum " + sum            +
                                   " is not a Harshad Number");
            }

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}