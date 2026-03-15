// Problem 1 : Employee Bonus Calculator for Zara Company
// Author: Aaditya
// Date: 15.03.26

// Find the bonus of 10 employees based on their years of service
// and the total bonus amount the company Zara has to pay,
// along with the old and new salary
// Bonus: 5% if years of service > 5, otherwise 2%

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Employees
        int numberOfEmployees = 10;

        // Fixed Values - Bonus Percentages
        double highBonusPercent = 5.0;
        double lowBonusPercent  = 2.0;

        // Fixed Value - Years of Service Threshold
        int serviceThreshold = 5;

        // Define double arrays to save salary and years of service
        // for each of the 10 employees
        double[] salary         = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];

        // Define double arrays to save the new salary and bonus amount
        double[] newSalary   = new double[numberOfEmployees];
        double[] bonusAmount = new double[numberOfEmployees];

        // Variables to save total bonus, total old salary, and new salary
        double totalBonus     = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Display Header for Input
        System.out.println("Zara Employee Bonus Calculator");
        System.out.println("=".repeat(60));
        System.out.println();

        // For Loop - Take input from the user for each employee
        // Initialization : i = 0
        // Condition       : i < numberOfEmployees
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("Employee " + (i + 1) + " :");

            // Take User Input for Salary
            System.out.print("  Enter salary           : ");
            salary[i] = input.nextDouble();

            // Check if salary is a valid number (positive)
            // If invalid, ask the user to enter again
            if (salary[i] <= 0) {

                // Output - Invalid Salary
                System.out.println("  Invalid salary. " +
                                   "Please enter a positive number.");

                // Decrement the index counter to re-enter
                i--;

                // Continue to next iteration
                continue;
            }

            // Take User Input for Years of Service
            System.out.print("  Enter years of service : ");
            yearsOfService[i] = input.nextDouble();

            // Check if years of service is a valid number (non-negative)
            // If invalid, ask the user to enter again
            if (yearsOfService[i] < 0) {

                // Output - Invalid Years of Service
                System.out.println("  Invalid years of service. " +
                                   "Please enter a non-negative number.");

                // Decrement the index counter to re-enter
                i--;

                // Continue to next iteration
                continue;
            }

            System.out.println();
        }

        // For Loop - Calculate the bonus of 10 employees
        // based on their years of service
        for (int i = 0; i < numberOfEmployees; i++) {

            // Check if years of service is more than 5 years
            if (yearsOfService[i] > serviceThreshold) {

                // Bonus of 5% for employees with > 5 years of service
                bonusAmount[i] = salary[i] * highBonusPercent / 100;

            } else {

                // Bonus of 2% for employees with <= 5 years of service
                bonusAmount[i] = salary[i] * lowBonusPercent / 100;
            }

            // Compute the new salary and save in the array
            newSalary[i] = salary[i] + bonusAmount[i];

            // Calculate total bonus
            totalBonus = totalBonus + bonusAmount[i];

            // Calculate total old salary
            totalOldSalary = totalOldSalary + salary[i];

            // Calculate total new salary
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Display Results
        System.out.println("Zara Employee Bonus Report");
        System.out.println("=".repeat(60));
        System.out.println();

        // For Loop - Display each employee's details
        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("Employee " + (i + 1) + " :");
            System.out.println("  Years of Service : " +
                               yearsOfService[i]);
            System.out.println("  Old Salary       : " + salary[i]);
            System.out.println("  Bonus Amount     : " + bonusAmount[i]);
            System.out.println("  New Salary       : " + newSalary[i]);
            System.out.println();
        }

        // Print the total bonus payout and total old and new salary
        System.out.println("=".repeat(60));
        System.out.println("Total Bonus Payout : " + totalBonus);
        System.out.println("Total Old Salary   : " + totalOldSalary);
        System.out.println("Total New Salary   : " + totalNewSalary);
        System.out.println("=".repeat(60));

        // Close Scanner
        input.close();
    }
}