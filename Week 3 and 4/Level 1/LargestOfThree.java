// Program to Check if First, Second or Third is the Largest of Three Numbers
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class LargestOfThree {
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

        // Check if the first number is the largest
        // number1 must be greater than both number2 and number3
        boolean isFirstLargest  = (number1 > number2) && (number1 > number3);

        // Check if the second number is the largest
        // number2 must be greater than both number1 and number3
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if the third number is the largest
        // number3 must be greater than both number1 and number2
        boolean isThirdLargest  = (number3 > number1) && (number3 > number2);

        // Output
        System.out.println("Is the first number the largest?  " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest?  " + isThirdLargest);

        // Close Scanner
        input.close();
    }
}