// Program to check whether a number is positive, negative, or zero
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner; 

public class NumberChecker {
    
    // Method to return -1 for negative, 1 for positive, 0 for zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check Number
        int result = checkNumber(number);
        
        // Display Result
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        
        // Close Scanner
        input.close();
    }
}