// Problem 6 : Find Youngest and Tallest Among 3 Friends
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Values - Names of 3 Friends
        String friend1 = "Amar";
        String friend2 = "Akbar";
        String friend3 = "Anthony";

        // Take User Input for Age of 3 Friends
        System.out.print("Enter the age of "    + friend1 + " : ");
        int age1 = input.nextInt();

        System.out.print("Enter the age of "    + friend2 + " : ");
        int age2 = input.nextInt();

        System.out.print("Enter the age of "    + friend3 + " : ");
        int age3 = input.nextInt();

        // Take User Input for Height of 3 Friends
        System.out.print("Enter the height of " + friend1 + " in cm : ");
        double height1 = input.nextDouble();

        System.out.print("Enter the height of " + friend2 + " in cm : ");
        double height2 = input.nextDouble();

        System.out.print("Enter the height of " + friend3 + " in cm : ");
        double height3 = input.nextDouble();

        // Find the Youngest Friend
        // Compare ages of all 3 friends using if - else if - else
        String youngestFriend;

        if (age1 < age2 && age1 < age3) {

            // Friend 1 is the Youngest
            youngestFriend = friend1;

        } else if (age2 < age1 && age2 < age3) {

            // Friend 2 is the Youngest
            youngestFriend = friend2;

        } else {

            // Friend 3 is the Youngest
            youngestFriend = friend3;
        }

        // Find the Tallest Friend
        // Compare heights of all 3 friends using if - else if - else
        String tallestFriend;

        if (height1 > height2 && height1 > height3) {

            // Friend 1 is the Tallest
            tallestFriend = friend1;

        } else if (height2 > height1 && height2 > height3) {

            // Friend 2 is the Tallest
            tallestFriend = friend2;

        } else {

            // Friend 3 is the Tallest
            tallestFriend = friend3;
        }

        // Output - Display Youngest and Tallest Friend
        System.out.println("\nThe youngest friend is " + youngestFriend);
        System.out.println("The tallest friend is  " + tallestFriend);

        // Close Scanner
        input.close();
    }
}