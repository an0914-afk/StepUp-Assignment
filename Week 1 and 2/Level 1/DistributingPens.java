// Program to Distribute Pens Among Students
// Author: Aaditya
// Date: 23.02.26

public class DistributingPens {
    public static void main(String[] args) {

        // Variables
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate Pens Per Student using Division Operator
        int pensPerStudent = totalPens / totalStudents;

        // Calculate Remaining Pens using Modulus Operator
        int remainingPens = totalPens % totalStudents;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}