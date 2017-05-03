  /**
   * file: Prob6_2.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 6_2 for lab 3, finding the sum of the digits of a number  
   */

/**
   * Prob6.1
   * 
   * This class declares the driver and includes main method for running 
   * problem 6_2, find the sum of digits of a number  
   * 
   */

import java.util.Scanner;

public class Prob6_2 {

  public static int sumDigits(long n) {

    long userInt = n;

    int sum = 0;

      while (userInt > 0) {

        long place = userInt % 10;

        sum += (int) place;

        userInt = userInt / 10;

      }

        return sum;

    }


  public static void main(String[] args) {

    System.out.print("Enter an integer: ");

    Scanner input = new Scanner(System.in);

    //make this long not int

    long userInt = input.nextLong();

    //invoke sumDigits here

    int ans = sumDigits(userInt);

    System.out.println("The sum of the digits in your integer is: " + ans);

    }
}
