// Problem 9 : Find Greatest Factor of a Number using For Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class GreatestFactorFor {
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

            // For Loop - Iterate from number - 1 down to 1
            // Initialization : i = number - 1
            // Condition       : i >= 1
            // Update          : i-- (decrement by 1 each iteration)
            for (int i = number - 1; i >= 1; i--) {

                // Check if the number is perfectly divisible by i
                // Using Modulus Operator - if remainder is 0 then i is a factor
                if (number % i == 0) {

                    // Assign i to greatestFactor
                    greatestFactor = i;

                    // Break the loop - Greatest Factor Found
                    break;
                }
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