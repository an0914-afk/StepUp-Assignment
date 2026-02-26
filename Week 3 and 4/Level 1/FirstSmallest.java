// Program to Check if the First is the Smallest of 3 Numbers
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Three Numbers
        System.out.print("Enter the first number  : ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double number2 = input.nextDouble();

        System.out.print("Enter the third number  : ");
        double number3 = input.nextDouble();

        // Check if the first number is the smallest
        // Using Logical AND Operator (&&)
        // number1 must be less than both number2 and number3
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close Scanner
        input.close();
    }
}