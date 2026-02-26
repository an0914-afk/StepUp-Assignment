// Program to Perform Double Operations and Understand Operator Precedence
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Three Double Values
        System.out.print("Enter value of a : ");
        double a = input.nextDouble();

        System.out.print("Enter value of b : ");
        double b = input.nextDouble();

        System.out.print("Enter value of c : ");
        double c = input.nextDouble();

        // Perform Double Operations
        // Operator Precedence: * and / are evaluated before + and -
        // % has same precedence as * and /

        // Operation 1: a + b * c => b*c evaluated first, then added to a
        double result1 = a + b * c;

        // Operation 2: a * b + c => a*b evaluated first, then c is added
        double result2 = a * b + c;

        // Operation 3: c + a / b => a/b evaluated first, then added to c
        double result3 = c + a / b;

        // Operation 4: a % b + c => a%b evaluated first, then c is added
        double result4 = a % b + c;

        // Output
        System.out.println("The results of Double Operations are " +
                            result1 + ", " + result2 + ", " +
                            result3 + ", and " + result4);

        // Close Scanner
        input.close();
    }
}