// Problem 7 : Check if a Number is an Abundant Number
// Author: Aaditya
// Date: 23.02.26

// An Abundant Number is an integer in which the sum of all
// divisors of the number is greater than the number itself
// e.g. Divisors of 12: 1, 2, 3, 4, 6
//      Sum = 1 + 2 + 3 + 4 + 6 = 16 > 12

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Initialize sum to 0
            // sum will store the sum of all divisors of the number
            int sum = 0;

            // For Loop - Find all divisors from 1 to number - 1
            // Initialization : i = 1
            // Condition       : i < number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i < number; i++) {

                // Check if the number is perfectly divisible by i
                // Using Modulus Operator - if remainder is 0 then i is a divisor
                if (number % i == 0) {

                    // Add i to sum
                    sum = sum + i;
                }
            }

            // Check if sum is greater than the number
            // If sum > number, it is an Abundant Number
            if (sum > number) {

                // Output - Number is an Abundant Number
                System.out.println("The number "        + number +
                                   " with divisor sum " + sum    +
                                   " is an Abundant Number");

            } else {

                // Output - Number is NOT an Abundant Number
                System.out.println("The number "        + number +
                                   " with divisor sum " + sum    +
                                   " is not an Abundant Number");
            }

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}