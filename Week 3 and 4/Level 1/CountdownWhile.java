// Program to Count Down from User Input Value to 1 using While Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Countdown Start Value
        System.out.print("Enter the countdown start value : ");
        int counter = input.nextInt();

        // Display Countdown Header
        System.out.println("\nRocket Launch Countdown:");

        // While Loop - Count down from counter to 1
        // Loop continues as long as counter is greater than or equal to 1
        while (counter >= 1) {

            // Print the current counter value
            System.out.println(counter);

            // Decrement the counter by 1
            counter--;
        }

        // Rocket Launch Message
        System.out.println("Rocket Launched! Blast Off!");

        // Close Scanner
        input.close();
    }
}