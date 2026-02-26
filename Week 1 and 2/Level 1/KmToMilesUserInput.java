// Program to Convert KM to Miles with User Input
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Variables
        double km;
        double kmToMilesConversionFactor = 1.6;

        // Take User Input
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        // Calculate Miles
        double miles = km / kmToMilesConversionFactor;

        // Output
        System.out.println("The total miles is " + miles +
                           " mile for the given " + km + " km");

        // Close Scanner
        input.close();
    }
}