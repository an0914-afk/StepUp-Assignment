// Program to Convert Weight from Pounds to Kilograms
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Conversion Factor - 1 pound = 2.2 kg
        double poundsToKgFactor = 2.2;

        // Take User Input for Weight in Pounds
        System.out.print("Enter the weight of the person in pounds : ");
        double weightInPounds = input.nextDouble();

        // Calculate Weight in Kilograms
        // Formula: weightInKg = weightInPounds / poundsToKgFactor
        double weightInKg = weightInPounds / poundsToKgFactor;

        // Output
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kg is " + weightInKg);

        // Close Scanner
        input.close();
    }
}