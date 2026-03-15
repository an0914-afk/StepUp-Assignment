// Problem 6 : Mean Height of Players in a Football Team
// Author: Aaditya
// Date: 15.03.26

// Create a program to find the mean height of players
// present in a football team
// Formula: mean = sum of all elements / number of elements

import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Players in a Football Team
        int numberOfPlayers = 11;

        // Create a double array named heights of size 11
        double[] heights = new double[numberOfPlayers];

        // Take User Input for each player's height
        System.out.println("Enter the height (in cm) of " +
                           numberOfPlayers + " football players :");
        System.out.println("=".repeat(50));

        // For Loop - Take input for each player's height
        // Initialization : i = 0
        // Condition       : i < numberOfPlayers
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < numberOfPlayers; i++) {

            // Prompt for player height
            System.out.print("Enter height of player " +
                             (i + 1) + " : ");
            heights[i] = input.nextDouble();
        }

        // Initialize sum to 0.0
        // sum will store the sum of all heights
        double sum = 0.0;

        // Find the sum of all the elements present in the array
        // For Loop - Add each height to sum
        for (int i = 0; i < heights.length; i++) {

            // Add current height to sum
            sum = sum + heights[i];
        }

        // Divide the sum by 11 to find the mean height
        double meanHeight = sum / numberOfPlayers;

        // Display Results
        System.out.println();
        System.out.println("Football Team Height Analysis :");
        System.out.println("=".repeat(50));
        System.out.println("Total sum of heights : " + sum + " cm");
        System.out.println("Number of players    : " + numberOfPlayers);
        System.out.println("Mean height          : " + meanHeight + " cm");

        // Close Scanner
        input.close();
    }
}