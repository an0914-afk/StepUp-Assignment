// Problem 4 : Largest and Second Largest Digit - Dynamic Array Resize
// Author: Aaditya
// Date: 15.03.26

// Rework of Problem 3 where if index equals maxDigit,
// we increase the size of the array by 10 instead of breaking
// This ensures all digits are considered for finding
// the largest and second-largest number

import java.util.Scanner;

public class LargestSecondLargestDynamic {
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

            // Output - Number is 0
            System.out.println("The number is 0.");
            System.out.println("Largest digit         : 0");
            System.out.println("Second largest digit  : does not exist");

        } else {

            // Define maxDigit variable initially set to 10
            int maxDigit = 10;

            // Define an array to store the digits
            int[] digits = new int[maxDigit];

            // Create an integer variable index with value 0
            // to reflect the array index
            int index = 0;

            // Store a copy of workingNumber for digit extraction
            long tempNumber = workingNumber;

            // While Loop - Iterate until the number is not equal to 0
            while (tempNumber != 0) {

                // Check if the index is equal to maxDigit
                if (index == maxDigit) {

                    // Increase maxDigit by 10
                    maxDigit = maxDigit + 10;

                    // Create a new temp array of size maxDigit
                    int[] temp = new int[maxDigit];

                    // Copy from current digits array into temp array
                    for (int j = 0; j < digits.length; j++) {
                        temp[j] = digits[j];
                    }

                    // Assign current digits array to the temp array
                    digits = temp;
                }

                // Remove the last digit from the number
                // Using Modulus Operator to get the last digit
                int digit = (int) (tempNumber % 10);

                // Add the digit to the array
                digits[index] = digit;

                // Remove the last digit using Division Operator
                tempNumber = tempNumber / 10;

                // Increment the index by 1
                index++;
            }

            // Define variables to store largest and second largest digit
            // Initialize both to zero
            int largest       = 0;
            int secondLargest = 0;

            // Loop through the array to find largest and second largest
            // Initialization : i = 0
            // Condition       : i < index
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i < index; i++) {

                // Check if current digit is greater than largest
                if (digits[i] > largest) {

                    // Move current largest to second largest
                    secondLargest = largest;

                    // Update largest
                    largest = digits[i];

                } else if (digits[i] > secondLargest &&
                           digits[i] != largest) {

                    // Update second largest
                    // Only if current digit is not equal to largest
                    secondLargest = digits[i];
                }
            }

            // Display Results
            System.out.println();
            System.out.println("Digit Analysis for number : " + number);
            System.out.println("(Dynamic Array - All digits processed)");
            System.out.println("=".repeat(50));

            // Display digits in the array
            System.out.print("Digits : ");
            for (int i = 0; i < index; i++) {
                System.out.print(digits[i] + " ");
            }
            System.out.println();
            System.out.println("Total digits : " + index);
            System.out.println();

            // Display largest and second largest
            System.out.println("Largest digit         : " + largest);
            System.out.println("Second largest digit  : " + secondLargest);
        }

        // Close Scanner
        input.close();
    }
}