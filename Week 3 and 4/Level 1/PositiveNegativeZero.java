// Program to Check if a Number is Positive, Negative, or Zero
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Check if the number is Positive, Negative, or Zero
        // Using if-else if-else ladder
        if (number > 0) {

            // Output - Number is Positive
            System.out.println("The number " + number + " is Positive");

        } else if (number < 0) {

            // Output - Number is Negative
            System.out.println("The number " + number + " is Negative");

        } else {

            // Output - Number is Zero
            System.out.println("The number " + number + " is Zero");
        }

        // Close Scanner
        input.close();
    }
}