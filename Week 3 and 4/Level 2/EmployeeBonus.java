// Problem 2 : Find Bonus of Employees Based on Years of Service
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Values - Bonus Percentage and Minimum Years of Service
        double bonusPercentage       = 5.0;   // 5% Bonus
        int    minimumYearsOfService = 5;      // Minimum 5 Years of Service

        // Take User Input for Salary
        System.out.print("Enter the employee salary in INR    : ");
        double salary = input.nextDouble();

        // Take User Input for Years of Service
        System.out.print("Enter the years of service in years : ");
        int yearsOfService = input.nextInt();

        // Check if the employee is eligible for bonus
        // Employee must have more than 5 years of service
        if (yearsOfService > minimumYearsOfService) {

            // Calculate Bonus Amount
            // Formula: bonus = salary * bonusPercentage / 100
            // Operator Precedence: Multiplication first then Division
            double bonusAmount = salary * bonusPercentage / 100;

            // Output - Employee is Eligible for Bonus
            System.out.println("The employee with salary INR "  + salary         +
                               " and years of service "         + yearsOfService +
                               " years is eligible for bonus."                   +
                               "\nThe bonus amount is INR "    + bonusAmount);

        } else {

            // Output - Employee is NOT Eligible for Bonus
            System.out.println("The employee with salary INR "  + salary         +
                               " and years of service "         + yearsOfService +
                               " years is not eligible for bonus.");
        }

        // Close Scanner
        input.close();
    }
}