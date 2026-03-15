// Problem 10 : Digit Frequency Counter
// Author: Aaditya
// Date: 15.03.26

// Take a number as input, find the frequency of each digit
// in the number using an array, and display the frequency

// Steps :
// Step 1 : Take the input for a number
// Step 2 : Find the count of digits in the number
// Step 3 : Find the digits in the number and save them in an array
// Step 4 : Find the frequency of each digit using a frequency array
//          of size 10 (for digits 0 to 9)
// Step 5 : Display the frequency of each digit in the number

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // ========================================================
        // Step 1 : Take the input for a number
        // ========================================================
        System.out.print("Enter a number : ");
        long number = input.nextLong();

        // Store the original number for display at the end
        long originalNumber = number;

        // Handle negative numbers by converting to positive
        // Negative sign is not a digit, so we work with absolute value
        if (number < 0) {
            number = -number;
        }

        // ========================================================
        // Handle Special Case : Number is 0
        // ========================================================
        if (number == 0) {

            // When number is 0, it has exactly 1 digit which is 0
            System.out.println();
            System.out.println("Digit Frequency for number : " +
                               originalNumber);
            System.out.println("=".repeat(50));
            System.out.println();

            // Display the digit
            System.out.println("Number of digits : 1");
            System.out.println("Digits array     : 0");
            System.out.println();

            // Display frequency
            System.out.println("Frequency of each digit :");
            System.out.println("-".repeat(30));
            System.out.println("Digit 0 : 1 time(s)");

        } else {

            // ====================================================
            // Step 2 : Find the count of digits in the number
            // ====================================================

            // Initialize digitCount to 0
            // digitCount will store the total number of digits
            int digitCount = 0;

            // Use a temporary variable to count digits
            // We do not want to modify the original number
            long tempNumber = number;

            // While Loop - Count digits by removing last digit each time
            // Loop continues as long as tempNumber is not equal to 0
            while (tempNumber != 0) {

                // Remove the last digit using Division Operator
                // tempNumber = tempNumber / 10
                tempNumber = tempNumber / 10;

                // Increment digitCount by 1 for each digit removed
                digitCount++;
            }

            // ====================================================
            // Step 3 : Find the digits in the number and
            //          save them in an array
            // ====================================================

            // Define an integer array to store the digits
            // Size of array = digitCount (exact number of digits)
            int[] digits = new int[digitCount];

            // Reset tempNumber to the number for digit extraction
            tempNumber = number;

            // Index variable to track position in the digits array
            // Initialize to 0 (start from the first position)
            int index = 0;

            // While Loop - Extract each digit and store in array
            // Loop continues as long as tempNumber is not equal to 0
            while (tempNumber != 0) {

                // Get the last digit using Modulus Operator
                // digit = tempNumber % 10
                // e.g. 12345 % 10 = 5 (last digit)
                int digit = (int) (tempNumber % 10);

                // Save the digit in the digits array at current index
                digits[index] = digit;

                // Remove the last digit using Division Operator
                // tempNumber = tempNumber / 10
                // e.g. 12345 / 10 = 1234 (last digit removed)
                tempNumber = tempNumber / 10;

                // Increment index by 1 to move to next array position
                index++;
            }

            // ====================================================
            // Step 4 : Find the frequency of each digit
            //          using a frequency array of size 10
            // ====================================================

            // Define a frequency array of size 10
            // Index 0 represents digit 0
            // Index 1 represents digit 1
            // Index 2 represents digit 2
            // ... and so on up to
            // Index 9 represents digit 9
            // Each element stores how many times that digit appears
            int[] frequency = new int[10];

            // Loop through the digits array
            // Initialization : i = 0
            // Condition       : i < digitCount
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i < digitCount; i++) {

                // Get the current digit from the digits array
                int currentDigit = digits[i];

                // Use the digit value as the index in frequency array
                // Increase the frequency of that digit by 1
                // e.g. if currentDigit = 5, then frequency[5]++
                frequency[currentDigit]++;
            }

            // ====================================================
            // Step 5 : Display the frequency of each digit
            //          in the number
            // ====================================================

            // Display Header
            System.out.println();
            System.out.println("Digit Frequency for number : " +
                               originalNumber);
            System.out.println("=".repeat(50));
            System.out.println();

            // Display total number of digits
            System.out.println("Number of digits : " + digitCount);

            // Display the digits stored in the array
            // Show in original order (reverse of how they were stored)
            // Since digits were stored from last to first,
            // we display from last index to first index
            System.out.print("Digits array     : ");

            // For Loop - Display digits in original number order
            // Start from digitCount - 1 and go down to 0
            for (int i = digitCount - 1; i >= 0; i--) {

                // Print each digit separated by a space
                System.out.print(digits[i] + " ");
            }
            System.out.println();
            System.out.println();

            // Display the frequency of each digit
            System.out.println("Frequency of each digit :");
            System.out.println("-".repeat(30));

            // For Loop - Display frequency for digits 0 to 9
            // Initialization : i = 0
            // Condition       : i < 10
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i < 10; i++) {

                // Only display digits that appear in the number
                // i.e. frequency is greater than 0
                if (frequency[i] > 0) {

                    // Display in format : Digit X : Y time(s)
                    System.out.println("Digit " + i +
                                       " : " + frequency[i] +
                                       " time(s)");
                }
            }

            // Display digits that do NOT appear in the number
            System.out.println();
            System.out.println("Digits not present in the number :");
            System.out.println("-".repeat(30));

            // Flag to check if any digit is absent
            boolean hasAbsentDigit = false;

            // For Loop - Check for digits with zero frequency
            for (int i = 0; i < 10; i++) {

                // Display digits that do NOT appear in the number
                // i.e. frequency is equal to 0
                if (frequency[i] == 0) {

                    // Display in format : Digit X : 0 time(s)
                    System.out.println("Digit " + i +
                                       " : 0 time(s)");

                    // Set flag to true
                    hasAbsentDigit = true;
                }
            }

            // If all digits are present
            if (!hasAbsentDigit) {
                System.out.println("All digits (0-9) are present " +
                                   "in the number");
            }
        }

        // Close Scanner
        input.close();
    }
}