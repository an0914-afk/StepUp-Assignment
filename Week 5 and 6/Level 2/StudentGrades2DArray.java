// Problem 9 : Student Grades using 2D Array
// Author: Aaditya
// Date: 15.03.26

// Take input marks of students in 3 subjects: Physics, Chemistry, Maths
// Store marks in a 2D array, compute percentage and grade

// Grade Table:
// Percentage >= 90 : Grade A
// Percentage >= 80 : Grade B
// Percentage >= 70 : Grade C
// Percentage >= 60 : Grade D
// Percentage >= 50 : Grade E
// Percentage <  50 : Grade F

import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Value - Number of Subjects
        int numberOfSubjects = 3;

        // Fixed Value - Maximum Marks per Subject
        double maxMarksPerSubject = 100.0;

        // Take Input for Number of Students
        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();

        // Check if the number is a Positive Integer
        if (numberOfStudents > 0) {

            // Create a 2D array to store marks of students
            // Rows    = Number of Students
            // Columns = Number of Subjects (Physics, Chemistry, Maths)
            // Column 0 = Physics
            // Column 1 = Chemistry
            // Column 2 = Maths
            double[][] marks = new double[numberOfStudents][numberOfSubjects];

            // Create arrays to store percentages and grades
            double[] percentages = new double[numberOfStudents];
            String[] grades      = new String[numberOfStudents];

            // Subject Names Array for Display
            String[] subjects = {"Physics", "Chemistry", "Maths"};

            // Take Input for Marks of Students
            System.out.println();
            System.out.println("Enter marks for " +
                               numberOfStudents + " students :");
            System.out.println("=".repeat(50));

            // For Loop - Take input for each student
            // Initialization : i = 0
            // Condition       : i < numberOfStudents
            // Update          : i++ (increment by 1 each iteration)
            for (int i = 0; i < numberOfStudents; i++) {

                System.out.println();
                System.out.println("Student " + (i + 1) + " :");

                // Flag to check if all marks are valid
                boolean validMarks = true;

                // Inner For Loop - Take input for each subject
                for (int j = 0; j < numberOfSubjects; j++) {

                    // Take User Input for Marks
                    System.out.print("  Enter " + subjects[j] +
                                     " marks : ");
                    marks[i][j] = input.nextDouble();

                    // Check if the marks are negative
                    if (marks[i][j] < 0) {

                        // Ask user to enter positive values
                        System.out.println("  Invalid marks. " +
                                           "Please enter positive values.");

                        // Set flag to false
                        validMarks = false;

                        // Break from inner loop
                        break;
                    }
                }

                // If marks were invalid, decrement index to re-enter
                if (!validMarks) {
                    i--;
                }
            }

            // Calculate Percentage and Grade of each student
            // Using the 2D array to access marks
            for (int i = 0; i < numberOfStudents; i++) {

                // Calculate total marks from the 2D array
                double totalMarks = 0.0;

                // Sum marks across all subjects
                for (int j = 0; j < numberOfSubjects; j++) {
                    totalMarks = totalMarks + marks[i][j];
                }

                // Calculate percentage
                // Total maximum marks = numberOfSubjects * maxMarksPerSubject
                double totalMaxMarks = numberOfSubjects * maxMarksPerSubject;
                percentages[i] = (totalMarks / totalMaxMarks) * 100;

                // Determine grade based on percentage
                if (percentages[i] >= 90) {

                    // Grade A
                    grades[i] = "A";

                } else if (percentages[i] >= 80) {

                    // Grade B
                    grades[i] = "B";

                } else if (percentages[i] >= 70) {

                    // Grade C
                    grades[i] = "C";

                } else if (percentages[i] >= 60) {

                    // Grade D
                    grades[i] = "D";

                } else if (percentages[i] >= 50) {

                    // Grade E
                    grades[i] = "E";

                } else {

                    // Grade F
                    grades[i] = "F";
                }
            }

            // Display Marks, Percentages, and Grades of each student
            System.out.println();
            System.out.println("Student Grade Report (2D Array) :");
            System.out.println("=".repeat(60));

            // For Loop - Display each student's details
            for (int i = 0; i < numberOfStudents; i++) {

                System.out.println();
                System.out.println("Student " + (i + 1) + " :");

                // Display marks for each subject from 2D array
                for (int j = 0; j < numberOfSubjects; j++) {
                    System.out.println("  " + subjects[j] +
                                       " Marks  : " + marks[i][j]);
                }

                System.out.printf("  Percentage  : %.2f%%%n",
                                  percentages[i]);
                System.out.println("  Grade       : " + grades[i]);
            }

        } else {

            // Output - Invalid Number
            System.out.println("Please enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}