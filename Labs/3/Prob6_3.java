  /**
   * file: Prob6_3.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 6_3 for lab 3, finding a palindrome of a number   
   */

/**
   * Prob6.3
   * 
   * This class declares the driver and includes main method for running 
   * problem 6_3, finding a palindrome of a number 
   * 
   */

import java.util.Scanner;

public class Prob6_3 {

  public static int reverse(int number) {

  int ans;

  // declare a string variable to allow each digit to be extracted and captured there

  String theNum = "";

  while (number > 0) {

    ans = number % 10;

    number /= 10;

    theNum += Integer.toString(ans);

  }

// before returning, convert to integer and return that integer (int)

    ans = Integer.parseInt(theNum);

    return ans;

  }


  public static boolean isPalindrome(int number){

    boolean isPal;


    if(reverse(number) == number) {

      isPal = true;

      System.out.print("Your number is, indeed, a palindrome, the reverse being " + reverse(number));


    } else {

      isPal = false;

      System.out.println("Your number " + number + " is not a palindrome.");

    }


        return isPal;
    }


    public static void main(String[] args) {

      System.out.print("Please enter an integer: ");

      Scanner input = new Scanner (System.in);

      int number = input.nextInt();

      reverse(number);

      isPalindrome(number);

    }

}


