// Program to Convert Height from CM to Feet and Inches
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Variables
        double heightCm;
        double cmToInchConversionFactor = 2.54;
        double inchToFeetConversionFactor = 12;

        // Take User Input
        System.out.print("Enter your Height in Centimeters: ");
        heightCm = input.nextDouble();

        // Calculate Height in Inches
        // 1 inch = 2.54 cm
        double heightInches = heightCm / cmToInchConversionFactor;

        // Calculate Height in Feet
        // 1 foot = 12 inches
        double heightFeet = heightInches / inchToFeetConversionFactor;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + heightFeet +
                           " and inches is " + heightInches);

        // Close Scanner
        input.close();
    }
}