// Program to Find Sam's Average Mark in PCM
// Author: Aaditya
// Date: 23.02.26

public class SamsAverageMark {
    public static void main(String[] args) {

        // Variables
        double mathsMark = 94;
        double physicsMark = 95;
        double chemistryMark = 96;
        double totalSubjects = 3;      

        // Calculate Average Mark
        // Operator Precedence: Addition first then Division
        double totalMark = mathsMark + physicsMark + chemistryMark;
        double averageMark = totalMark / totalSubjects;

        // Type Conversion - Convert averageMark to int to get whole number
        int averageMarkInt = (int) averageMark;

        // Output
        System.out.println("Sam's average mark in PCM is " + averageMark);
        System.out.println("Sam's average mark in PCM (whole number) is " + averageMarkInt);
    }
}