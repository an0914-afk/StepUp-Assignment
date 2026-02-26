// Program to Calculate Simple Interest
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Principal Amount
        System.out.print("Enter the Principal amount in INR : ");
        double principal = input.nextDouble();

        // Take User Input for Rate of Interest
        System.out.print("Enter the Rate of Interest        : ");
        double rate = input.nextDouble();

        // Take User Input for Time Period
        System.out.print("Enter the Time period in years    : ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        // Formula: Simple Interest = Principal * Rate * Time / 100
        // Operator Precedence: Multiplication first then Division
        double simpleInterest = principal * rate * time / 100;

        // Output
        System.out.println("The Simple Interest is " + simpleInterest  +
                           " for Principal "          + principal       +
                           ", Rate of Interest "      + rate            +
                           " and Time "               + time);

        // Close Scanner
        input.close();
    }
}