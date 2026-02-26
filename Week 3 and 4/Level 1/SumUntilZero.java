// Program to Find Sum of Numbers Until User Enters 0
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Take First User Input
        System.out.print("Enter a number (0 to stop) : ");
        double userEntry = input.nextDouble();

        // While Loop - Continue until user enters 0
        // Loop continues as long as userEntry is not 0
        while (userEntry != 0) {

            // Add User Entry to Total
            total = total + userEntry;

            // Take Next User Input
            System.out.print("Enter a number (0 to stop) : ");
            userEntry = input.nextDouble();
        }

        // Output - Display Total Sum
        System.out.println("The total sum is " + total);

        // Close Scanner
        input.close();
    }
}