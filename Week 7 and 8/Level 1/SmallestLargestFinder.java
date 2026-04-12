// Program to find smallest and largest of 3 numbers
// Author: Aaditya
// Date: 13.04.26

import java.util.Scanner; 

public class SmallestLargestFinder {
    
    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        
        // Check with number2
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        
        // Check with number3
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        // Return array with smallest at index 0 and largest at index 1
        return new int[] {smallest, largest};
    }
    
    public static void main(String[] args) {
        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        // Take User Input for 3 Numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        // Find Smallest and Largest
        int[] result = findSmallestAndLargest(num1, num2, num3);
        
        // Display Result
        System.out.println("\nSmallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
        
        // Close Scanner
        input.close();
    }
}