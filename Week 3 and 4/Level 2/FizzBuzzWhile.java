// Problem 5 : FizzBuzz Program using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // Initialize counter to 1
            int counter = 1;

            // While Loop - Iterate from 1 to number
            // Loop continues as long as counter is <= number
            while (counter <= number) {

                // Check for FizzBuzz - Multiple of both 3 and 5
                if (counter % 3 == 0 && counter % 5 == 0) {

                    // Output - FizzBuzz
                    System.out.println("FizzBuzz");

                // Check for Fizz - Multiple of 3
                } else if (counter % 3 == 0) {

                    // Output - Fizz
                    System.out.println("Fizz");

                // Check for Buzz - Multiple of 5
                } else if (counter % 5 == 0) {

                    // Output - Buzz
                    System.out.println("Buzz");

                } else {

                    // Output - Print the Number
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