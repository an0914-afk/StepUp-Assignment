// Problem 5 : Count Number of Digits in an Integer
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number
        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        // Store the original number for display at the end
        int originalNumber = number;

        // Initialize count to 0
        // count will store the number of digits
        int count = 0;

        // Handle the case where number is 0
        // 0 has 1 digit
        if (number == 0) {

            // Assign count to 1 for 0
            count = 1;

        } else {

            // Handle Negative Numbers
            // Convert to positive for digit counting
            if (number < 0) {
                number = -number;
            }

            // While Loop - Remove last digit until number becomes 0
            // Loop continues as long as number is not equal to 0
            while (number != 0) {

                // Remove the last digit using Division Operator
                // number = number / 10
                number = number / 10;

                // Increment count by 1 for each digit removed
                count++;
            }
        }

        // Output - Display Number of Digits
        System.out.println("The number " + originalNumber +
                           " has "       + count          +
                           " digits");

        // Close Scanner
        input.close();
    }
}