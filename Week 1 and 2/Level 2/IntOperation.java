// Program to Perform Integer Operations and Understand Operator Precedence
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Take User Input for Three Integer Values
        System.out.print("Enter value of a : ");
        int a = input.nextInt();

        System.out.print("Enter value of b : ");
        int b = input.nextInt();

        System.out.print("Enter value of c : ");
        int c = input.nextInt();

        // Perform Integer Operations
        // Operator Precedence: * and / are evaluated before + and -
        // % has same precedence as * and /

        // Operation 1: a + b * c => b*c evaluated first, then added to a
        int result1 = a + b * c;

        // Operation 2: a * b + c => a*b evaluated first, then c is added
        int result2 = a * b + c;

        // Operation 3: c + a / b => a/b evaluated first, then added to c
        int result3 = c + a / b;

        // Operation 4: a % b + c => a%b evaluated first, then c is added
        int result4 = a % b + c;

        // Output
        System.out.println("The results of Int Operations are " +
                            result1 + ", " + result2 + ", " +
                            result3 + ", and " + result4);

        // Close Scanner
        input.close();
    }
}