// Program to calculate rounds needed for 5 km run in triangular park
// Author: Aaditya
// Date: 13.04.26 

import java.util.Scanner;

public class AthleteParkRounds {
    
    // Method to compute number of rounds needed for 5km run
    public static int calculateRounds(double side1, double side2, double side3) {
        // Calculate perimeter of triangle (in meters)
        double perimeter = side1 + side2 + side3;
        
        // Distance to complete: 5 km = 5000 meters
        double distance = 5000;
        
        // Calculate number of rounds (using ceiling to get complete rounds)
        int rounds = (int) Math.ceil(distance / perimeter);
        
        return rounds;
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input for Triangle Sides
        System.out.println("Enter the three sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Side 2: ");
        double side2 = input.nextDouble();
        
        System.out.print("Side 3: ");
        double side3 = input.nextDouble();
        
        // Calculate Rounds
        int rounds = calculateRounds(side1, side2, side3);
        
        // Calculate Perimeter
        double perimeter = side1 + side2 + side3;
        
        // Display Result
        System.out.println("\nPerimeter of the park: " + perimeter + " meters");
        System.out.println("Number of rounds needed to complete 5 km: " + rounds);
        
        // Close Scanner
        input.close();
    }
}