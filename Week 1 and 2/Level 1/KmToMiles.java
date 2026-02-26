// Program to Convert Distance from Kilometers to Miles
// Author: Aaditya
// Date: 23.02.26

public class KmToMiles {
    public static void main(String[] args) {

        // Variables
        double km = 10.8;
        double kmToMilesConversionFactor = 1.6;

        // Calculate Miles
        double miles = km * kmToMilesConversionFactor;

        // Output
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}