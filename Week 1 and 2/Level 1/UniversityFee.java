// Program to Calculate University Fee with Discount
// Author: Aaditya
// Date: 23.02.26

public class UniversityFee {
    public static void main(String[] args) {

        // Variables
        double fee = 125000;
        double discountPercent = 10;

        // Calculate Discount
        // Operator Precedence: Multiplication first then Division
        double discount = fee * discountPercent / 100;

        // Calculate Final Fee
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}