// Program to Calculate Total Purchase Price
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Unit Price
        System.out.print("Enter the unit price in INR : ");
        double unitPrice = input.nextDouble();

        // Take User Input for Quantity
        System.out.print("Enter the quantity          : ");
        int quantity = input.nextInt();

        // Calculate Total Purchase Price
        // Formula: totalPrice = unitPrice * quantity
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        // Close Scanner
        input.close();
    }
}