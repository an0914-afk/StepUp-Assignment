// Program to Find Factorial of a Number using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer (Natural Number)
        if (number > 0) {

            // Initialize factorial to 1
            // Factorial of 0 is 1 and we multiply from 1 to n
            long factorial = 1;

            // Initialize counter to 1
            int counter = 1;

            // While Loop - Multiply numbers from 1 to n
            // Loop continues as long as counter is <= number
            while (counter <= number) {

                // Multiply factorial by counter
                factorial = factorial * counter;

                // Increment counter by 1
                counter++;
            }

            // Output - Display Factorial
            System.out.println("The factorial of " + number +
                               " is " + factorial);

        } else {

            // Output - Number is NOT a Positive Integer
            System.out.println("The number " + number +
                               " is not a positive integer");
        }

        // Close Scanner
        input.close();
    }
}