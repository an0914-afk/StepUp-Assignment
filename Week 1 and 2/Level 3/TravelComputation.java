// Program to Compute Total Distance and Travel Time with User Input
// Rewrite of Sample Program 2 with User Inputs
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Traveler Name
        System.out.print("Enter the name of the traveler    : ");
        String name = input.nextLine();

        // Take User Input for City Names
        System.out.print("Enter the from city               : ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city                : ");
        String viaCity = input.nextLine();

        System.out.print("Enter the to city                 : ");
        String toCity = input.nextLine();

        // Take User Input for Distance from From City to Via City in KM
        System.out.print("Enter distance from " + fromCity +
                         " to " + viaCity + " in km   : ");
        double distanceFromToVia = input.nextDouble();

        // Take User Input for Distance from Via City to Final City in KM
        System.out.print("Enter distance from " + viaCity  +
                         " to " + toCity   + " in km   : ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take User Input for Time from From City to Via City in Hours and Minutes
        System.out.print("Enter time from " + fromCity +
                         " to " + viaCity + " in hours   : ");
        int hoursFromToVia = input.nextInt();

        System.out.print("Enter time from " + fromCity +
                         " to " + viaCity + " in minutes : ");
        int minsFromToVia = input.nextInt();

        // Take User Input for Time from Via City to Final City in Hours and Minutes
        System.out.print("Enter time from " + viaCity  +
                         " to " + toCity   + " in hours   : ");
        int hoursViaToFinalCity = input.nextInt();

        System.out.print("Enter time from " + viaCity  +
                         " to " + toCity   + " in minutes : ");
        int minsViaToFinalCity = input.nextInt();

        // Calculate Total Distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculate Total Time in Minutes
        // Operator Precedence: Multiplication first then Addition
        int timeFromToVia       = hoursFromToVia      * 60 + minsFromToVia;
        int timeViaToFinalCity  = hoursViaToFinalCity * 60 + minsViaToFinalCity;
        int totalTime           = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name     +
                           " from "   + fromCity      +
                           " to "     + toCity        +
                           " via "    + viaCity       +
                           " is "     + totalDistance +
                           " km and the Total Time taken is " + totalTime +
                           " minutes");

        // Close Scanner
        input.close();
    }
}