// Problem 3 : Check if a Given Number is a Prime Number
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number greater than 1 : ");
        int number = input.nextInt();

        // Check if the number is greater than 1
        // Prime Number checks are done for numbers greater than 1
        if (number > 1) {

            // Initialize isPrime to true
            // Assume the number is Prime until proven otherwise
            boolean isPrime = true;

            // For Loop - Check divisibility from 2 to number - 1
            // Initialization : i = 2
            // Condition       : i < number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 2; i < number; i++) {

                // Check if the number is perfectly divisible by i
                // Using Modulus Operator - if remainder is 0 then not Prime
                if (number % i == 0) {

                    // Number is divisible by i - Not a Prime Number
                    isPrime = false;

                    // Break out of the loop - No need to check further
                    break;
                }
            }

            // Output - Display Prime Number Result
            if (isPrime) {
                System.out.println("The number " + number +
                                   " is a Prime Number");
            } else {
                System.out.println("The number " + number +
                                   " is not a Prime Number");
            }

        } else {

            // Output - Number is NOT greater than 1
            System.out.println("Please enter a number greater than 1");
        }

        // Close Scanner
        input.close();
    }
}