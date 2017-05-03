  /**
   * file: Prob6_20.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 3, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 6.20 for lab 4, counting the number
   * of letters in a string 
   */


/**
   * Prob6.20
   * 
   * This class declares the driver and includes main method for running 
   * problem 6.20. 
   */

import java.util.Scanner;
import java.io.*;


public class Prob6_20 {

  //main method

  public static void main(String[] args) {

    System.out.print("Please enter a string: ");

    Scanner input = new Scanner (System.in);

    String userString = input.next();

    //invoke the count letters method

    System.out.print(countLetters(userString));

  }

    //method to find the length of the string "s" the user inputs

    public static int countLetters(String s) {

      return s.length();
      
    }

}
