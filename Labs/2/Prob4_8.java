 /**
   * file: 4_8.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.8 for Lab 2.
   */
/**
   * Prob4_1
   * 
   * This class implements the driver for problem 4.8 for lab 2
   */





import java.util.Scanner;

public class Prob4_8 {

    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("Please enter a ASCII Code: ");

       int userInt = input.nextInt();

       System.out.print("The character for ASCII Code " + userInt + " is " + (char)userInt);


    }

}
