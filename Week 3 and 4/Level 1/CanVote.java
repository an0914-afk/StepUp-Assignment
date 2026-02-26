// Program to Check if a Person Can Vote Based on Age
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Minimum Voting Age
        int minimumVotingAge = 18;

        // Take User Input for Age
        System.out.print("Enter the person's age : ");
        int age = input.nextInt();

        // Check if the person is eligible to vote
        // Person must be 18 or older to vote
        if (age >= minimumVotingAge) {

            // Output - Person Can Vote
            System.out.println("The person's age is " + age +
                               " and can vote.");

        } else {

            // Output - Person Cannot Vote
            System.out.println("The person's age is " + age +
                               " and cannot vote.");
        }

        // Close Scanner
        input.close();
    }
}