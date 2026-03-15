// Problem 5 : Reverse a Number using Array
// Author: Aaditya
// Date: 15.03.26

// Take a number as input, store the digits in an array,
// and display the array in reverse order to show the reversed number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number : ");
        long number = input.nextLong();

        // Handle negative numbers
        boolean isNegative = false;
        long workingNumber = number;

        if (workingNumber < 0) {
            isNegative    = true;
            workingNumber = -workingNumber;
        }

        // Handle the case where number is 0
        if (workingNumber == 0) {

            // Output - Reversed number is also 0
            System.out.println("Original number  : " + number);
            System.out.println("Reversed number  : 0");

        } else {

            // Step 1 : Find the count of digits in the number
            int digitCount = 0;
            long tempNumber = workingNumber;

            // While Loop - Count digits
            while (tempNumber != 0) {

                // Remove the last digit using Division Operator
                tempNumber = tempNumber / 10;

                // Increment digit count
                digitCount++;
            }

            // Step 2 : Find the digits and save them in an array
            int[] digits = new int[digitCount];

            // Reset tempNumber for digit extraction
            tempNumber = workingNumber;

            // Index variable for array
            int index = 0;

            // While Loop - Extract each digit and store in array
            while (tempNumber != 0) {

                // Get the last digit using Modulus Operator
                digits[index] = (int) (tempNumber % 10);

                // Remove the last digit using Division Operator
                tempNumber = tempNumber / 10;

                // Increment index
                index++;
            }

            // Step 3 : Create an array to store digits in reverse order
            int[] reversed = new int[digitCount];

            // Copy elements of digits array in reverse order
            // The digits array already has digits in reverse order
            // (last digit first), so reversing it gives original order
            // But we want to reverse the number, so we use digits as-is
            for (int i = 0; i < digitCount; i++) {
                reversed[i] = digits[i];
            }

            // Display Results
            System.out.println();
            System.out.println("Number Reversal :");
            System.out.println("=".repeat(40));
            System.out.println("Original number  : " + number);

            // Display the reversed number
            System.out.print("Reversed number  : ");

            // Add negative sign if original was negative
            if (isNegative) {
                System.out.print("-");
            }

            // Display the elements of the reversed array
            for (int i = 0; i < digitCount; i++) {
                System.out.print(reversed[i]);
            }
            System.out.println();

            // Display digits array
            System.out.println();
            System.out.print("Digits array     : ");
            for (int i = 0; i < digitCount; i++) {
                System.out.print(reversed[i] + " ");
            }
            System.out.println();
        }

        // Close Scanner
        input.close();
    }
}