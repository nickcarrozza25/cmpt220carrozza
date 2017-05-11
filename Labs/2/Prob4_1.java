 /**
   * file: 4_1.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.1 for Lab 2.
   */
/**
   * Prob4_1
   * 
   * This class implements the driver for problem 4.1 for lab 2
   */






import java.util.Scanner;


public class Prob4_1 {

    public static void main (String[] args) {

        System.out.print("Enter the length from the center to the vertex: ");

        Scanner input = new Scanner (System.in);

        double radius = input.nextDouble();

        double side = (2 * radius * (Math.sin(Math.PI / 5)));

        double area = ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));

        // to round the answer to two decimal places

        double ans = (Math.round(area * 100) / 100.0);

        System.out.printf("The area of the pentagon is " + ans);

    }


}

