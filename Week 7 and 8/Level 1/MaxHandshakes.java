// Program to find maximum number of handshakes among students
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner; 

public class MaxHandshakes {
    
    // Method to calculate maximum handshakes using combination formula
    public static int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input for Number of Students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate Maximum Handshakes
        int maxHandshakes = calculateMaxHandshakes(numberOfStudents);
        
        // Display Result
        System.out.println("\nMaximum number of possible handshakes: " + maxHandshakes);
        
        // Close Scanner
        input.close();
    }
}