// Program to Find Maximum Number of Handshakes Among N Students
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number of Students
        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();

        // Calculate Maximum Number of Handshakes
        // Formula: combination = n * (n - 1) / 2
        // Operator Precedence: Brackets first, then Multiplication, then Division
        int numberOfHandshakes = numberOfStudents * (numberOfStudents - 1) / 2;

        // Output
        System.out.println("The maximum number of handshakes among " +
                            numberOfStudents + " students is " +
                            numberOfHandshakes);

        // Close Scanner
        input.close();
    }
}