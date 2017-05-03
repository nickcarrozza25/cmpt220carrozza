  /**
   * file: Prob6_1.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 6_1 for lab 3, return a pentagonal number  
   */

/**
   * Prob6.1
   * 
   * This class declares the driver and includes main method for running 
   * problem 6_1, return a pentagonal number 
   * 
   */

public class Prob6_1 {

  public static int getPentagonalNumber(int n) {

    n = ((n * ((3 * n) - 1)) / 2);

      return n;

  }

  public static void main(String[] args) {

    int count = 1;

    //repeat code 100 times
    while (count <=  100) {

      //once 10 numbers are printed, println to begin new line
      if (count % 10 == 0) {

      System.out.println(getPentagonalNumber(count) + " ");

        } else {

          System.out.print(getPentagonalNumber(count) + " ");

        }

          count++;

        }

    }

}


