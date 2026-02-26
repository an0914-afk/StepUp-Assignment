// Problem 1 : Print Odd and Even Numbers between 1 to N
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // For Loop - Iterate from 1 to number
            // Initialization : i = 1
            // Condition       : i <= number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 1; i <= number; i++) {

                // Check if the current number is Even or Odd
                // Using Modulus Operator - if remainder is 0 then Even
                if (i % 2 == 0) {

                    // Output - Number is Even
                    System.out.println(i + " is Even");

                } else {

                    // Output - Number is Odd
                    System.out.println(i + " is Odd");
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