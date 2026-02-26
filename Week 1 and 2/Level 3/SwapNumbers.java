// Program to Swap Two Numbers
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Two Numbers
        System.out.print("Enter the first number  : ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double number2 = input.nextDouble();

        // Swap number1 and number2 using a temporary variable
        // Step 1: Store number1 in a temporary variable
        double temp = number1;

        // Step 2: Assign number2 to number1
        number1 = number2;

        // Step 3: Assign temp (original number1) to number2
        number2 = temp;

        // Output
        System.out.println("The swapped numbers are " + number1 +
                           " and " + number2);

        // Close Scanner
        input.close();
    }
}