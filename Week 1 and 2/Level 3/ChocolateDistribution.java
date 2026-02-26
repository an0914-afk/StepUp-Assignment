// Program to Distribute Chocolates Among Children
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Number of Chocolates
        System.out.print("Enter the number of chocolates : ");
        int numberOfChocolates = input.nextInt();

        // Take User Input for Number of Children
        System.out.print("Enter the number of children   : ");
        int numberOfChildren = input.nextInt();

        // Calculate Chocolates Per Child using Division Operator
        // Formula: chocolatesPerChild = numberOfChocolates / numberOfChildren
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate Remaining Chocolates using Modulus Operator
        // Formula: remainingChocolates = numberOfChocolates % numberOfChildren
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output
        System.out.println("The number of chocolates each child gets is " +
                            chocolatesPerChild +
                           " and the number of remaining chocolates are " +
                            remainingChocolates);

        // Close Scanner
        input.close();
    }
}