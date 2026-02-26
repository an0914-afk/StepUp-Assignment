// Program to Count Down from User Input Value to 1 using For Loop
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Countdown Start Value
        System.out.print("Enter the countdown start value : ");
        int startValue = input.nextInt();

        // Display Countdown Header
        System.out.println("\nRocket Launch Countdown:");

        // For Loop - Count down from startValue to 1
        // Initialization  : counter = startValue
        // Condition        : counter >= 1
        // Update           : counter-- (decrement by 1)
        for (int counter = startValue; counter >= 1; counter--) {

            // Print the current counter value
            System.out.println(counter);
        }

        // Rocket Launch Message
        System.out.println("Rocket Launched! Blast Off!");

        // Close Scanner
        input.close();
    }
}