// Program to Find Number of Rounds Athlete Must Complete in a Triangular Park
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Total Distance to Run in Meters
        // 5 km = 5000 meters
        double totalDistanceInMeters = 5000;

        // Take User Input for Three Sides of the Triangle in Meters
        System.out.print("Enter the first side of the triangle in meters  : ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the triangle in meters : ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the triangle in meters  : ");
        double side3 = input.nextDouble();

        // Calculate Perimeter of the Triangle
        // Formula: perimeter = side1 + side2 + side3
        double perimeter = side1 + side2 + side3;

        // Calculate Number of Rounds
        // Formula: rounds = totalDistance / perimeter
        double numberOfRounds = totalDistanceInMeters / perimeter;

        // Output
        System.out.println("The total number of rounds the athlete will run is " +
                            numberOfRounds + " to complete 5 km");

        // Close Scanner
        input.close();
    }
}