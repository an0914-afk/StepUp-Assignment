// Program to Check if a Number is Divisible by 5
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for the Number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        // Using Modulus Operator - if remainder is 0 then divisible
        boolean isDivisible = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number +
                           " divisible by 5? " + isDivisible);

        // Close Scanner
        input.close();
    }
}