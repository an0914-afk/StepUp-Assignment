// Program to Find Sum Until User Enters 0 or a Negative Number
// Using Infinite While Loop and Break Statement
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Infinite While Loop - Loop continues until break is encountered
        while (true) {

            // Take User Input
            System.out.print("Enter a number (0 or negative to stop) : ");
            double userEntry = input.nextDouble();

            // Check if user entered 0 or a Negative Number
            // If yes, break out of the loop using break statement
            if (userEntry <= 0) {
                break;
            }

            // Add User Entry to Total if not 0 or Negative
            total = total + userEntry;
        }

        // Output - Display Total Sum
        System.out.println("The total sum is " + total);

        // Close Scanner
        input.close();
    }
}