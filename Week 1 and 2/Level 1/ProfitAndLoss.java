// Program to Calculate Profit and Loss
// Author: Aaditya
// Date: 23.02.26

public class ProfitAndLoss {
    public static void main(String[] args) {

        // Variables
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate Profit
        // Profit = Selling Price - Cost Price
        double profit = sellingPrice - costPrice;

        // Calculate Profit Percentage
        // Operator Precedence: Division first then Multiplication
        // Profit Percentage = Profit / Cost Price * 100
        double profitPercentage = profit / costPrice * 100;

        // Type Conversion - Convert profitPercentage to int to get whole number
        int profitPercentageInt = (int) profitPercentage;

        // Output using Single Print Statement with Multiline Text
        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                         "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " + profitPercentageInt + "%");
    }
}