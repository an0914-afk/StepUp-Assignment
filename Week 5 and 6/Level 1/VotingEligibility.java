// Problem 1 : Voting Eligibility Check for 10 Students
// Author: Aaditya
// Date: 15.03.26

// Take user input for the age of all 10 students in a class
// and check whether the student can vote depending on
// his/her age is greater or equal to 18

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Students
        int numberOfStudents = 10;

        // Fixed Value - Minimum Voting Age
        int votingAge = 18;

        // Define an array of 10 integer elements for student ages
        int[] ages = new int[numberOfStudents];

        // Take User Input for each student's age
        System.out.println("Enter the age of " + numberOfStudents +
                           " students :");
        System.out.println("=".repeat(40));

        // For Loop - Take input for each student
        // Initialization : i = 0
        // Condition       : i < numberOfStudents
        // Update          : i++ (increment by 1 each iteration)
        for (int i = 0; i < numberOfStudents; i++) {

            // Prompt for student age
            System.out.print("Enter age of student " + (i + 1) + " : ");
            ages[i] = input.nextInt();
        }

        // Display Results
        System.out.println();
        System.out.println("Voting Eligibility Results :");
        System.out.println("=".repeat(40));

        // Loop through the array using the length property
        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {

            // Check if the age is a negative number
            if (ages[i] < 0) {

                // Output - Invalid Age
                System.out.println("Student " + (i + 1) +
                                   " : Invalid age (" + ages[i] + ")");

            } else if (ages[i] >= votingAge) {

                // Age is 18 or above - Can Vote
                System.out.println("The student with the age " +
                                   ages[i] + " can vote");

            } else {

                // Age is below 18 - Cannot Vote
                System.out.println("The student with the age " +
                                   ages[i] + " cannot vote");
            }
        }

        // Close Scanner
        input.close();
    }
}