// Program to Find the Area of a Triangle in Sq Inches and Sq Centimeters
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Conversion Factor - 1 inch = 2.54 cm
        double cmPerInch     = 2.54;

        // 1 sq inch = 2.54 * 2.54 sq cm
        double sqCmPerSqInch = cmPerInch * cmPerInch;

        // Take User Input for Base and Height in CM
        System.out.print("Enter the base of the triangle in cm   : ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm : ");
        double height = input.nextDouble();

        // Calculate Area in Square Centimeters
        // Formula: Area = 1/2 * base * height
        double areaInSqCm = 0.5 * base * height;

        // Convert Area from Square Centimeters to Square Inches
        double areaInSqIn = areaInSqCm / sqCmPerSqInch;

        // Output
        System.out.println("The Area of the triangle in sq in is " +
                            areaInSqIn + " and sq cm is " + areaInSqCm);

        // Close Scanner
        input.close();
    }
}