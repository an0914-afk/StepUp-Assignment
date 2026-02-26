// Problem 7 : Find Factors of a Number using For Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FactorsFor {
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

            // For Loop - Iterate from 1 to number - 1
            // Initialization : i = 1
            // Condition       : i < number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i < number; i++) {

                // Check if the number is perfectly divisible by i
                // Using Modulus Operator - if remainder is 0 then i is a factor
                if (number % i == 0) {

                    // Output - Print the Factor
                    System.out.println(i);
                }
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