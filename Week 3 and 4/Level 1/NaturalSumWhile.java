// Program to Find Sum of N Natural Numbers using While Loop
// and Compare with Formula n*(n+1)/2
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for N
        System.out.print("Enter a positive integer (n) : ");
        int number = input.nextInt();

        // Check if the number is a Natural Number
        // A Natural Number is a positive integer (greater than 0)
        if (number > 0) {

            // Calculate Sum using Formula
            // Formula: sum = n * (n + 1) / 2
            int formulaSum = number * (number + 1) / 2;

            // Calculate Sum using While Loop
            // Initialize loop variables
            int loopSum = 0;
            int counter = 1;

            // While Loop - Add numbers from 1 to n
            while (counter <= number) {

                // Add counter to loopSum
                loopSum = loopSum + counter;

                // Increment counter by 1
                counter++;
            }

            // Compare the two results
            boolean resultsMatch = (formulaSum == loopSum);

            // Output
            System.out.println("Sum using Formula   : " + formulaSum);
            System.out.println("Sum using While Loop: " + loopSum);
            System.out.println("Both Results Match  : " + resultsMatch);

        } else {

            // Output - Number is NOT a Natural Number
            System.out.println("The number " + number +
                               " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}