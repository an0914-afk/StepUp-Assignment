// Program to Check if the Given Date is in Spring Season
// Author: Aaditya
// Date: 23.02.26

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Create Scanner Object for User Input
        Scanner input = new Scanner(System.in);

        // Fixed Values - Spring Season
        // Spring Season is from March 20 to June 20
        int springStartMonth = 3;   // March
        int springStartDay   = 20;  // 20th
        int springEndMonth   = 6;   // June
        int springEndDay     = 20;  // 20th

        // Take User Input for Month and Day
        System.out.print("Enter the month (1-12) : ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31)   : ");
        int day = input.nextInt();

        // Check if the given date is in Spring Season
        // Spring is from March 20 to June 20
        // Condition 1: Month is March (3) and day is >= 20
        // Condition 2: Month is April (4) or May (5)
        // Condition 3: Month is June (6) and day is <= 20
        boolean isSpring = (month == springStartMonth && day >= springStartDay) ||
                           (month == 4 || month == 5)                           ||
                           (month == springEndMonth   && day <= springEndDay);

        // Output using if-else
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close Scanner
        input.close();
    }
}