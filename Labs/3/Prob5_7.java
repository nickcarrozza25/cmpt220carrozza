  /**
   * file: Prob5_7.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 5.7 for lab 3, calculating tuition cost
   */


/**
   * Prob5.7
   * 
   * This class declares the driver and includes main method for running 
   * problem 5.7, counting tuition cost 
   */

package Labs;
public class Prob5_7 {

  public static void main(String[] args){

    int status;

    double tuition = 10000;

    for (status = 1; status <= 10; status++) {

      tuition *= 1.05;

    }


    System.out.print("The value of a years tuition after ten years from today is: ");

    System.out.printf("%.2f\n", tuition);

    int check;


    for (check = 1; check <= 4; check ++) {

      tuition *= 1.05;

      System.out.print("The cost of tuition for year " + check + " is: ");

      System.out.printf("%.2f\n", tuition);

    }

      System.out.println();

    }

}