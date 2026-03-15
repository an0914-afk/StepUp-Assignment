// Problem 7 : BMI Calculator using Multi-Dimensional Array
// Author: Aaditya
// Date: 15.03.26

// Find the BMI of all persons in a team using a multi-dimensional
// array to store height, weight, and BMI for all persons
// BMI Formula: weight (kg) / (height (m) * height (m))

// BMI Weight Status Table:
// BMI < 18.5           : Underweight
// BMI >= 18.5 and < 25 : Normal weight
// BMI >= 25 and < 30   : Overweight
// BMI >= 30            : Obese

import java.util.Scanner;

public class BmiMultiDimensional {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take Input for Number of Persons
        System.out.print("Enter the number of persons : ");
        int number = input.nextInt();

        // Check if the number is a Positive Integer
        if (number > 0) {

            // Create a multi-dimensional array to store
            // weight, height, and BMI
            // Column 0 = Weight (kg)
            // Column 1 = Height (m)
            // Column 2 = BMI
            double[][] personData = new double[number][3];

            // Create a String array to store the weight status
            String[] weightStatus = new String[number];

            // Take Input for Weight and Height of each person
            System.out.println();
            System.out.println("Enter weight and height of " +
                               number + " persons :");
            System.out.println("=".repeat(50));

            // For Loop - Take input for each person
            // Initialization : i = 0
            // Condition       : i < number
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i < number; i++) {

                System.out.println();
                System.out.println("Person " + (i + 1) + " :");

                // Take User Input for Weight (kg)
                System.out.print("  Enter weight (kg)     : ");
                personData[i][0] = input.nextDouble();

                // Check for negative weight values
                if (personData[i][0] <= 0) {

                    // Ask user to enter positive values
                    System.out.println("  Please enter a positive " +
                                       "value for weight.");

                    // Decrement index to re-enter
                    i--;
                    continue;
                }

                // Take User Input for Height (m)
                System.out.print("  Enter height (meters) : ");
                personData[i][1] = input.nextDouble();

                // Check for negative height values
                if (personData[i][1] <= 0) {

                    // Ask user to enter positive values
                    System.out.println("  Please enter a positive " +
                                       "value for height.");

                    // Decrement index to re-enter
                    i--;
                    continue;
                }
            }

            // Calculate BMI of all persons and store in personData array
            // Also find the weight status
            for (int i = 0; i < number; i++) {

                // Get weight and height from the 2D array
                double weight = personData[i][0];
                double height = personData[i][1];

                // Calculate BMI = weight / (height * height)
                personData[i][2] = weight / (height * height);

                // Get the BMI value
                double bmi = personData[i][2];

                // Determine weight status based on BMI
                if (bmi < 18.5) {

                    // Underweight
                    weightStatus[i] = "Underweight";

                } else if (bmi >= 18.5 && bmi < 25) {

                    // Normal weight
                    weightStatus[i] = "Normal weight";

                } else if (bmi >= 25 && bmi < 30) {

                    // Overweight
                    weightStatus[i] = "Overweight";

                } else {

                    // Obese
                    weightStatus[i] = "Obese";
                }
            }

            // Display the height, weight, BMI, and status of each person
            System.out.println();
            System.out.println("BMI Report (Multi-Dimensional Array) :");
            System.out.println("=".repeat(60));

            // For Loop - Display each person's details
            for (int i = 0; i < number; i++) {

                System.out.println();
                System.out.println("Person " + (i + 1) + " :");
                System.out.println("  Weight        : " +
                                   personData[i][0] + " kg");
                System.out.println("  Height        : " +
                                   personData[i][1] + " m");
                System.out.printf("  BMI           : %.2f%n",
                                  personData[i][2]);
                System.out.println("  Weight Status : " +
                                   weightStatus[i]);
            }

        } else {

            // Output - Invalid Number
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}