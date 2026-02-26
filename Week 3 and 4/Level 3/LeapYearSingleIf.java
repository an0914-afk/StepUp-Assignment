// Problem 2 : Leap Year Program using Single If Condition with Logical Operators
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Gregorian Calendar Start Year
        int gregorianStartYear = 1582;

        // Take User Input for Year
        System.out.print("Enter a year : ");
        int year = input.nextInt();

        // Check if the year is in the Gregorian Calendar
        // Gregorian Calendar starts from 1582
        if (year < gregorianStartYear) {

            // Output - Year is not in the Gregorian Calendar
            System.out.println("The year " + year +
                               " is not in the Gregorian Calendar." +
                               " Please enter a year >= " + gregorianStartYear);

        } else {

            // Check for Leap Year using Single If Condition
            // Leap Year Formula using Logical AND (&&) and OR (||) Operators
            // A year is a Leap Year if:
            // (Divisible by 4 AND not Divisible by 100) OR (Divisible by 400)
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) ||
                                 (year % 400 == 0);

            // Output - Display Leap Year Result
            if (isLeapYear) {
                System.out.println("The year " + year + " is a Leap Year");
            } else {
                System.out.println("The year " + year + " is not a Leap Year");
            }
        }

        // Close Scanner
        input.close();
    }
}