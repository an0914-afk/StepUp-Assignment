// Problem 10 : Digit Frequency Counter
// Author: Aaditya
// Date: 15.03.26

// Take a number as input, find the frequency of each digit
// in the number using an array, and display the frequency

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number : ");
        long number = input.nextLong();

        // Handle negative numbers by converting to positive
        long workingNumber = number;
        if (workingNumber < 0) {
            workingNumber = -workingNumber;
        }

        // Handle the case where number is 0
        if (workingNumber == 0) {

            // Output - Frequency of digit 0 is 1
            System.out.println();
            System.out.println("Digit Frequency for number : " + number);
            System.out.println("=".repeat(40));
            System.out.println("Digit 0 : 1");

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

            // Index variable for digits array
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

            // Step 3 : Find the frequency of each digit
            // Define a frequency array of size 10
            // Index 0-9 represents digits 0-9
            int[] frequency = new int[10];

            // Loop through the digits array
            // Increase the frequency of each digit
            for (int i = 0; i < digitCount; i++) {

                // Use the digit as the index in the frequency array
                // Increment the count for that digit
                frequency[digits[i]]++;
            }

            // Display Results
            System.out.println();
            System.out.println("Digit Frequency for number : " + number);
            System.out.println("=".repeat(40));

            // Display digits array
            System.out.print("Digits in number : ");
            for (int i = digitCount - 1; i >= 0; i--) {
                System.out.print(digits[i] + " ");
            }
            System.out.println();
            System.out.println();

            // Display frequency of each digit (only non-zero frequencies)
            System.out.println("Frequency of each digit :");
            System.out.println("-".repeat(30));

            // For Loop - Display frequency for digits 0-9
            for (int i = 0; i < 10; i++) {

                // Only display digits that appear in the number
                if (frequency[i] > 0) {

                    System.out.println("Digit " + i +
                                       " : " + frequency[i] +
                                       " time(s)");
                }
            }
        }

        // Close Scanner
        input.close();
    }
}