// Program to Find the Side of a Square from its Perimeter
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Sides in a Square
        int numberOfSides = 4;

        // Take User Input for Perimeter
        System.out.print("Enter the perimeter of the square : ");
        double perimeter = input.nextDouble();

        // Calculate Side of the Square
        // Formula: side = perimeter / 4
        double side = perimeter / numberOfSides;

        // Output
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        // Close Scanner
        input.close();
    }
}