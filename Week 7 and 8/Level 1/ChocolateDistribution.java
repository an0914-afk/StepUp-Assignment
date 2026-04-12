// Program to divide chocolates among children
// Author: Aaditya
// Date: 13.04.26
 
import java.util.Scanner;

public class ChocolateDistribution {
    
    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;  // Each child gets
        int remainingChocolates = number % divisor; // Remaining chocolates
        
        // Return array with chocolates per child and remaining
        return new int[] {chocolatesPerChild, remainingChocolates};
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Check for division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero!");
        } else {
            // Calculate Distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            
            // Display Result
            System.out.println("\nEach child will get: " + result[0] + " chocolate(s)");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        
        // Close Scanner
        input.close();
    }
}