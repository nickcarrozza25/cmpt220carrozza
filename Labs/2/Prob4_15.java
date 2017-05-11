 /**
   * file: 4_15.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.15 for Lab 2.
   */
/**
   * Prob4_15
   * 
   * This class implements the driver for problem 4.15 for lab 2
   */




import java.util.Scanner;


public class Prob4_15 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        String userInput = input.nextLine();

        //convert the users letter to uppercase to avoid having both upper and lowercase in the
        // following test conditions, regardless if user enters upper or lowercase
        String letter = userInput.toUpperCase();

        //series of else-ifs to determine where the letter belongs on the phone pad

        if (letter.equals("A") || letter.equals("B") || letter.equals("C")){

            System.out.println("The corresponding number is 2");

        } else if (letter.equals("D") || letter.equals("E") || letter.equals("F")){

            System.out.println("The corresponding number is 3");

        } else if (letter.equals("G") || letter.equals("H") || letter.equals("I")){

            System.out.println("The corresponding number is 4");

        } else if (letter.equals("J") || letter.equals("K") || letter.equals("L")){

            System.out.println("The corresponding number is 5");

        } else if (letter.equals("M") || letter.equals("N") || letter.equals("O")){

            System.out.println("The corresponding number is 6");

        } else if (letter.equals("P") || letter.equals("Q") || letter.equals("R") || letter.equals("S")){

            System.out.println("The corresponding number is 7");

        } else if (letter.equals("T") || letter.equals("U") || letter.equals("V")){

            System.out.println("The corresponding number is 8");

        } else if (letter.equals("W") || letter.equals("X") || letter.equals("Y") || letter.equals("Z")){

            System.out.println("The corresponding number is 9");

        } else {

            System.out.println(letter + " is invalid input.");

        }


    }
}
