  /**
   * file: Prob5_1.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 5.1 for lab 3, determine the number of positive and negative numbers 
   */

/**
   * Prob5.1
   * 
   * This class declares the driver and includes main method for running 
   * problem 5.1, determine number of postive and negative numbers 
   */


import java.util.Scanner;

public class Prob5_1 {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int total = 0;

    int next;

    int posCount = 0;

    int negCount = 0;

    System.out.print("Enter an integer, the input ends if it is 0: ");

      do {
      //counts the amount of numbers the user types
      next = input.nextInt();

      //checks to see if the integer is greater than one (Positive)
      if (next >= 1) {

        posCount++;

        //else increment negative number amount since it is negative by default
        } else {

          negCount++;

        }

          // add each number the user types to the total
          total += next;


        } while (next != 0);

          System.out.println("The number of positives is: " + posCount);

          System.out.println("The number of negatives is: " + negCount);

          System.out.println("The total is: " + total);

    }

}
