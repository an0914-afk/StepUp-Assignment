// Problem 2 : Youngest and Tallest Friend among Amar, Akbar, Anthony
// Author: Aaditya
// Date: 15.03.26

// Find the youngest friend among 3 friends based on their ages
// and the tallest among the friends based on their heights

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Friends
        int numberOfFriends = 3;

        // String array to store the names of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Double arrays to store age and height of the 3 friends
        double[] ages    = new double[numberOfFriends];
        double[] heights = new double[numberOfFriends];

        // Take User Input for age and height of each friend
        System.out.println("Enter age and height of 3 friends :");
        System.out.println("=".repeat(50));

        // For Loop - Take input for each friend
        // Initialization : i = 0
        // Condition       : i < numberOfFriends
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < numberOfFriends; i++) {

            System.out.println();
            System.out.println("Friend : " + names[i]);

            // Take User Input for Age
            System.out.print("  Enter age (in years)    : ");
            ages[i] = input.nextDouble();

            // Take User Input for Height
            System.out.print("  Enter height (in cm)    : ");
            heights[i] = input.nextDouble();
        }

        // Find the Youngest of the 3 Friends
        // Initialize youngest index to 0 (assume first friend is youngest)
        int youngestIndex = 0;

        // Loop through the array and find the youngest
        // Initialization : i = 1 (start from second friend)
        // Condition       : i < numberOfFriends
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 1; i < numberOfFriends; i++) {

            // Compare current age with the youngest age found so far
            if (ages[i] < ages[youngestIndex]) {

                // Update youngest index
                youngestIndex = i;
            }
        }

        // Find the Tallest of the 3 Friends
        // Initialize tallest index to 0 (assume first friend is tallest)
        int tallestIndex = 0;

        // Loop through the array and find the tallest
        // Initialization : i = 1 (start from second friend)
        // Condition       : i < numberOfFriends
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 1; i < numberOfFriends; i++) {

            // Compare current height with the tallest height found so far
            if (heights[i] > heights[tallestIndex]) {

                // Update tallest index
                tallestIndex = i;
            }
        }

        // Display Results
        System.out.println();
        System.out.println("Results :");
        System.out.println("=".repeat(50));
        System.out.println();

        // Display all friends' details
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.println(names[i] +
                               " - Age: " + ages[i] + " years" +
                               ", Height: " + heights[i] + " cm");
        }

        System.out.println();

        // Display the youngest friend
        System.out.println("Youngest Friend : " +
                           names[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + " years)");

        // Display the tallest friend
        System.out.println("Tallest Friend  : " +
                           names[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + " cm)");

        // Close Scanner
        input.close();
    }
}