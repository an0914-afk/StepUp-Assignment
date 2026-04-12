// Program to check if given date falls in Spring Season
// Author: Aaditya
// Date: 13.04.26
 
public class SpringSeason {
    
    // Method to check for Spring season (March 20 to June 20)
    public static boolean isSpring(int month, int day) {
        // Spring is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true; // March 20 onwards
        } else if (month == 4 || month == 5) {
            return true; // All of April and May
        } else if (month == 6 && day <= 20) {
            return true; // June 1 to 20
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        
        // Get month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        // Check for Spring Season
        boolean spring = isSpring(month, day);
        
        // Display Result
        if (spring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}