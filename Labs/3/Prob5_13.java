  /**
   * file: Prob5_13.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 5.13 for lab 3, determine the largest integer whose
   * square is less than 12000 
   */

/**
   * Prob5.13
   * 
   * This class declares the driver and includes main method for running 
   * problem 5.13, determine the largest integer whose
   * square is less than 12000 
   */


public class Prob5_13 {

    public static void main(String[] args) {

        int n = 0;

        //compute the square of n until 12000 is reached

        while ((n * n) <= 12000){

            n++;

        }

        //must subtract by one to handle the additional increment before the while loop is exited

        System.out.println("The largest integer whose square is less than 12000 is: " + (n - 1));

        System.out.println("The value of " + n + "^2 is " + ((n - 1) * (n - 1)));

    }
}
