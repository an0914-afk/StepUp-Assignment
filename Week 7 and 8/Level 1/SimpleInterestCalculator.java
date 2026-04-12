// Program to calculate Simple Interest
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner; 

public class SimpleInterestCalculator {
    
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input for Principal
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        
        // Take User Input for Rate
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        
        // Take User Input for Time
        System.out.print("Enter Time period (in years): ");
        double time = input.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        
        // Display Result
        System.out.println("\nThe Simple Interest is " + simpleInterest + 
                         " for Principal " + principal + 
                         ", Rate of Interest " + rate + 
                         " and Time " + time);
        
        // Close Scanner
        input.close();
    }
}