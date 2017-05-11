package Labs;

 /**
   * file: 4_5.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.5 for Lab 2.
   */
/**
   * Prob4_5
   * 
   * This class implements the driver for problem 4.5 for lab 2
   */




import java.util.Scanner;


public class Prob4_5 {

    public static void main(String[] args){

        System.out.print("Enter the number of sides: ");

        Scanner input = new Scanner(System.in);

        double numSides = input.nextDouble();

        System.out.print("Enter the side: ");

        double sideLength = input.nextDouble();

        double area = (numSides * (Math.pow(sideLength, 2))) / ( 4 * (Math.tan((Math.PI) / numSides)));

        System.out.println("The area of the polygon is: " + area);


    }


}
