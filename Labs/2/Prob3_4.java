 /**
   * file: 3_4.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 3.4 for Lab 2.
   */
/**
   * Prob3_4
   * 
   * This class implements the driver for problem 3.4 for lab 2
   */






public class Prob3_4 {

    public static void main(String[] args) {

        int randNum = (int) (Math.random() * 12);

        if (randNum == 0) {

            while (randNum == 0) {

                int newNum = (int) (Math.random() * 12);

                randNum = newNum;

            }

        }

        if (randNum != 0) {

            System.out.println(randNum);

            if (randNum == 1) {

                System.out.println("January");

            } else if (randNum == 2) {

                System.out.println("February");

            } else if (randNum == 3) {

                System.out.println("March");

            } else if (randNum == 4) {

                System.out.println("April");

            } else if (randNum == 5) {

                System.out.println("May");

            } else if (randNum == 6) {

                System.out.println("June");

            } else if (randNum == 7) {

                System.out.println("July");

            } else if (randNum == 8) {

                System.out.println("August");

            } else if (randNum == 9) {

                System.out.println("September");

            } else if (randNum == 10) {

                System.out.println("October");

            } else if (randNum == 11) {

                System.out.println("November");

            } else if (randNum == 12) {

                System.out.println("December");

            }

        }
    }

}