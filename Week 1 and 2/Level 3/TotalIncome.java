// Program to Calculate Total Income from Salary and Bonus
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Salary
        System.out.print("Enter your Salary in INR : ");
        double salary = input.nextDouble();

        // Take User Input for Bonus
        System.out.print("Enter your Bonus in INR  : ");
        double bonus = input.nextDouble();

        // Calculate Total Income
        // Formula: income = salary + bonus
        double income = salary + bonus;

        // Output
        System.out.println("The salary is INR " + salary  +
                           " and bonus is INR " + bonus   +
                           ". Hence Total Income is INR " + income);

        // Close Scanner
        input.close();
    }
}