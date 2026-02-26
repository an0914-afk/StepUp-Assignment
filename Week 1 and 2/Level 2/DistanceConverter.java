// Program to Convert Distance from Feet to Yards and Miles
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Conversion Constants
        // 1 yard = 3 feet
        int feetPerYard  = 3;

        // 1 mile = 1760 yards
        int yardsPerMile = 1760;

        // Take User Input for Distance in Feet
        System.out.print("Enter the distance in feet : ");
        double distanceInFeet = input.nextDouble();

        // Calculate Distance in Yards
        // Formula: yards = feet / 3
        double distanceInYards = distanceInFeet / feetPerYard;

        // Calculate Distance in Miles
        // Formula: miles = yards / 1760
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        // Close Scanner
        input.close();
    }
}