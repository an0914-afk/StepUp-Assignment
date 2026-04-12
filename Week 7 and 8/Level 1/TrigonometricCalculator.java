// Program to calculate trigonometric functions
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner; 

public class TrigonometricCalculator {
    
    // Method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return array with sine, cosine, and tangent
        return new double[] {sine, cosine, tangent};
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Create object of TrigonometricCalculator
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        
        // Take User Input
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        
        // Calculate Trigonometric Functions
        double[] result = calculator.calculateTrigonometricFunctions(angle);
        
        // Display Results
        System.out.println("\nTrigonometric Functions for " + angle + " degrees:");
        System.out.println("=".repeat(50));
        System.out.printf("Sine   : %.4f%n", result[0]);
        System.out.printf("Cosine : %.4f%n", result[1]);
        System.out.printf("Tangent: %.4f%n", result[2]);
        
        // Close Scanner
        input.close();
    }
}