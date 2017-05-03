  /**
   * file: Prob5_12.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 5.12 for lab 3, determine the smallest integer whose 
   * square is greater than 12000
   */

/**
   * Prob5.12
   * 
   * This class declares the driver and includes main method for running 
   * problem 5.12, determine number of postive and negative numbers 
   */

import java.lang.Math;

public class Prob5_12 {

  public static void main(String[] args){

    int n = 0;

      while ((n*n) <= 12000) {

        n++;

       }

        System.out.println("The smallest integer whose square is greater than 12000 is: " + (n + 1));

        System.out.println("The value of " + (n + 1) + "^2 is : "  + (n + 1) * (n + 1));

    }

}
