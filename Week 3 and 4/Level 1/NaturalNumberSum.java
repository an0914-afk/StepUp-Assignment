// Program to Check Natural Number and Find Sum of N Natural Numbers
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // Calculate Sum of N Natural Numbers using Formula
            // Formula: sum = n * (n + 1) / 2
            // Operator Precedence: Brackets first, then Multiplication, then Division
            int sum = number * (number + 1) / 2;

            // Output - Number is a Natural Number
            System.out.println("The sum of " + number +
                               " natural numbers is " + sum);

        } else {

            // Output - Number is NOT a Natural Number
            System.out.println("The number " + number +
                               " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}