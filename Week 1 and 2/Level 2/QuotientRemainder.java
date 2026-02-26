// Program to Find Quotient and Remainder of Two Numbers
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Two Numbers
        System.out.print("Enter the first number  : ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();

        // Calculate Quotient using Division Operator
        int quotient = number1 / number2;

        // Calculate Remainder using Modulus Operator
        int remainder = number1 % number2;

        // Output
        System.out.println("The Quotient is "  + quotient  +
                           " and Reminder is " + remainder +
                           " of two number "   + number1   +
                           " and "             + number2);

        // Close Scanner
        input.close();
    }
}