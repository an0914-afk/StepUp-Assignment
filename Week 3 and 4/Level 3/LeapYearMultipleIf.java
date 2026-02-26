// Problem 1 : Leap Year Program using Multiple If-Else Statements
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class LeapYearMultipleIf {
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

            // Check for Leap Year using Multiple If-Else Statements
            // Leap Year Conditions:
            // Condition 1 : Divisible by 400 - Always a Leap Year
            // Condition 2 : Divisible by 100 - Not a Leap Year
            // Condition 3 : Divisible by 4   - Always a Leap Year
            // Condition 4 : Not Divisible by 4 - Not a Leap Year
            boolean isLeapYear;

            if (year % 400 == 0) {

                // Divisible by 400 - Always a Leap Year
                // e.g. 2000 is a Leap Year
                isLeapYear = true;

            } else if (year % 100 == 0) {

                // Divisible by 100 but not 400 - NOT a Leap Year
                // e.g. 1800 is NOT a Leap Year
                isLeapYear = false;

            } else if (year % 4 == 0) {

                // Divisible by 4 but not 100 - Always a Leap Year
                // e.g. 2024 is a Leap Year
                isLeapYear = true;

            } else {

                // Not Divisible by 4 - NOT a Leap Year
                // e.g. 2023 is NOT a Leap Year
                isLeapYear = false;
            }

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