// Problem 9 : Copy 2D Array into a Single Dimension Array
// Author: Aaditya
// Date: 15.03.26

// Write a Java program to create a 2D Array and
// Copy the 2D Array into a single dimension array

import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Rows
        System.out.print("Enter number of rows    : ");
        int rows = input.nextInt();

        // Take User Input for Columns
        System.out.print("Enter number of columns : ");
        int columns = input.nextInt();

        // Check if rows and columns are positive
        if (rows > 0 && columns > 0) {

            // Create a 2D Array (Matrix) with user-specified dimensions
            int[][] matrix = new int[rows][columns];

            // Take User Input for the 2D Array
            System.out.println();
            System.out.println("Enter the elements of the " +
                               rows + "x" + columns + " matrix :");
            System.out.println("=".repeat(40));

            // Nested For Loop - Outer loop for rows
            for (int i = 0; i < rows; i++) {

                // Inner loop for columns - access each element
                for (int j = 0; j < columns; j++) {

                    // Prompt for each element
                    System.out.print("Enter element [" + i +
                                     "][" + j + "] : ");
                    matrix[i][j] = input.nextInt();
                }
            }

            // Display the 2D Array (Matrix)
            System.out.println();
            System.out.println("2D Array (Matrix) :");
            System.out.println("=".repeat(40));

            // Nested For Loop - Display the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Create a 1D array of size rows * columns
            int[] array = new int[rows * columns];

            // Define the index variable for the 1D array
            int index = 0;

            // Nested For Loop - Copy every element of 2D array into 1D array
            // Outer for loop for rows
            for (int i = 0; i < rows; i++) {

                // Inner for loop to access each element in the row
                for (int j = 0; j < columns; j++) {

                    // Copy element from 2D array to 1D array
                    array[index] = matrix[i][j];

                    // Increment the index
                    index++;
                }
            }

            // Display the 1D Array
            System.out.println();
            System.out.println("1D Array (Copied from 2D Array) :");
            System.out.println("=".repeat(40));

            // For Loop - Display the 1D array
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        } else {

            // Output - Invalid Rows or Columns
            System.out.println("Please enter positive values for " +
                               "rows and columns");
        }

        // Close Scanner
        input.close();
    }
}