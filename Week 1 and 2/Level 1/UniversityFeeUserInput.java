// Program to Calculate University Fee with Discount using User Input
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class UniversityFeeUserInput {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Variables
        double fee;
        double discountPercent;

        // Take User Input for Fee
        System.out.print("Enter the Course Fee in INR: ");
        fee = input.nextDouble();

        // Take User Input for Discount Percentage
        System.out.print("Enter the Discount Percentage: ");
        discountPercent = input.nextDouble();

        // Calculate Discount
        // Operator Precedence: Multiplication first then Division
        double discount = fee * discountPercent / 100;

        // Calculate Final Fee
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        // Close Scanner
        input.close();
    }
}