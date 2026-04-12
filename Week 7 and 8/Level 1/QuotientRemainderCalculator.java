// Program to find quotient and remainder of two numbers
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner;

public class QuotientRemainderCalculator {
    
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Division operator for quotient
        int remainder = number % divisor;  // Modulus operator for remainder
        
        // Return array with quotient at index 0 and remainder at index 1
        return new int[] {quotient, remainder};
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else {
            // Find Quotient and Remainder
            int[] result = findRemainderAndQuotient(number, divisor);
            
            // Display Result
            System.out.println("\nQuotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
        
        // Close Scanner
        input.close();
    }
}