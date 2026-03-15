// Problem 10 : FizzBuzz Program
// Author: Aaditya
// Date: 15.03.26

// Take a number as user input and if it is a positive integer
// loop from 0 to the number and save the number, but for
// multiples of 3 save "Fizz", for multiples of 5 save "Buzz",
// and for multiples of both save "FizzBuzz".
// Finally, print the array results for each index position

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Create a String Array to save the results
            // Size is number + 1 (to include 0 to number)
            String[] results = new String[number + 1];

            // For Loop - Loop from 0 to the number
            // Initialization : i = 0
            // Condition       : i <= number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i <= number; i++) {

                // Check for multiples of both 3 and 5 first
                // Using Modulus Operator
                if (i % 3 == 0 && i % 5 == 0) {

                    // Multiple of both 3 and 5 - Save "FizzBuzz"
                    results[i] = "FizzBuzz";

                } else if (i % 3 == 0) {

                    // Multiple of 3 - Save "Fizz"
                    results[i] = "Fizz";

                } else if (i % 5 == 0) {

                    // Multiple of 5 - Save "Buzz"
                    results[i] = "Buzz";

                } else {

                    // Not a multiple of 3 or 5 - Save the number
                    // Convert integer to String using String.valueOf()
                    results[i] = String.valueOf(i);
                }
            }

            // Display the FizzBuzz Results
            System.out.println();
            System.out.println("FizzBuzz Results (0 to " + number + ") :");
            System.out.println("=".repeat(40));

            // For Loop - Show results based on index position
            for (int i = 0; i <= number; i++) {

                // Display in format : Position i = result
                System.out.println("Position " + i +
                                   " = " + results[i]);
            }

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}