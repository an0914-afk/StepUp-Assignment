// Program to Calculate Volume of Earth in KM and Miles
// Author: Aaditya
// Date: 23.02.26

public class VolumeOfEarth {
    public static void main(String[] args) {

        // Variables
        double pi = Math.PI;
        double radiusKm = 6378;
        double kmToMilesConversionFactor = 1.6;
        double radiusMiles = radiusKm / kmToMilesConversionFactor;

        // Calculate Volume of Earth in Cubic Kilometers
        // Volume of Sphere = (4/3) * pi * r^3
        // Operator Precedence: Brackets first then Multiplication
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Calculate Volume of Earth in Cubic Miles
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}