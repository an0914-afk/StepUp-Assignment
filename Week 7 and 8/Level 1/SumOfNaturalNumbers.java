// Program to find sum of n natural numbers using loop
// Author: Aaditya
// Date: 13.04.26
 
import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    // Method to find sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;
        
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        // Calculate Sum
        int sum = calculateSum(n);
        
        // Display Result
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        
        // Close Scanner
        input.close();
    }
}