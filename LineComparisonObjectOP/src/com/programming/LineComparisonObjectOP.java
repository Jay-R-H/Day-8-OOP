package com.programming;

import java.util.Scanner;

public class LineComparisonObjectOP {
    Scanner sc = new Scanner(System.in);
    /*Instance variable are declared*/
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    /*constructor is called to assign instance variable to the Line comparison object */
    public LineComparisonObjectOP(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void main(String[] args) {
        /*welcome message is printed
        *Line comparison object class is called and initialized
        *Method line length calculation is called to compute the length of lines from the coordinates provided
        *After the computation of length both lengths are compared to give result whether the lengths are equal or unequal  */
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparisonObjectOP l1 = new LineComparisonObjectOP(2.0, 3.0, 4.0, 5.0);
        LineComparisonObjectOP l2 = new LineComparisonObjectOP(3.0, 3.0, 4.0, 5.0);
        double lengthL1 = lineLengthCalc(l1.x1, l1.y1, l1.x2, l1.y2);
        double lengthL2 = lineLengthCalc(l2.x1, l2.y1, l2.x2, l2.y2);
        lineLengthComparison(lengthL1, lengthL2);
    }
    /*Method lineLengthCalc will compute the length of lines from the co-ordinates inputs */
    public static double lineLengthCalc(double x1, double y1, double x2, double y2) {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
    /*Method lineLengthComparison will compare the length of two lines taken as input and prints whether lines are equal or unequal*/
    public static void lineLengthComparison(double lengthL1, double lengthL2) {
        if (lengthL1==lengthL2) {
            System.out.println("Length of both lines are equal");
        } else {
            System.out.println("Lengths are unequal");
        }
    }

}
