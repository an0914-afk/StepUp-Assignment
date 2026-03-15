// Problem 2 : Positive, Negative, Zero Check with Even/Odd
//             and First-Last Element Comparison
// Author: Aaditya
// Date: 15.03.26

// Take user input for 5 numbers and check whether a number is
// positive, negative, or zero. For positive numbers check if
// the number is even or odd. Finally compare the first and last
// elements of the array

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Elements
        int size = 5;

        // Define an integer array of 5 elements
        int[] numbers = new int[size];

        // Take User Input for each number
        System.out.println("Enter " + size + " numbers :");
        System.out.println("=".repeat(40));

        // For Loop - Take input for each number
        // Initialization : i = 0
        // Condition       : i < size
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < size; i++) {

            // Prompt for number
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
        }

        // Display Results
        System.out.println();
        System.out.println("Number Analysis Results :");
        System.out.println("=".repeat(40));

        // Loop through the array using the length property
        for (int i = 0; i < numbers.length; i++) {

            // Check if the number is positive
            if (numbers[i] > 0) {

                // Number is Positive - Check for Even or Odd
                // Using Modulus Operator - if remainder is 0 then Even
                if (numbers[i] % 2 == 0) {

                    // Output - Positive and Even
                    System.out.println("Number " + numbers[i] +
                                       " is Positive and Even");

                } else {

                    // Output - Positive and Odd
                    System.out.println("Number " + numbers[i] +
                                       " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {

                // Output - Number is Negative
                System.out.println("Number " + numbers[i] +
                                   " is Negative");

            } else {

                // Output - Number is Zero
                System.out.println("Number " + numbers[i] +
                                   " is Zero");
            }
        }

        // Compare the First and Last Elements of the Array
        System.out.println();
        System.out.println("First and Last Element Comparison :");
        System.out.println("=".repeat(40));

        // Get the first element (index 0) and last element (index length - 1)
        int firstElement = numbers[0];
        int lastElement  = numbers[numbers.length - 1];

        // Compare first and last elements
        if (firstElement == lastElement) {

            // Output - First and Last Elements are Equal
            System.out.println("First element (" + firstElement +
                               ") is equal to Last element (" +
                               lastElement + ")");

        } else if (firstElement > lastElement) {

            // Output - First Element is Greater than Last Element
            System.out.println("First element (" + firstElement +
                               ") is greater than Last element (" +
                               lastElement + ")");

        } else {

            // Output - First Element is Less than Last Element
            System.out.println("First element (" + firstElement +
                               ") is less than Last element (" +
                               lastElement + ")");
        }

        // Close Scanner
        input.close();
    }
}