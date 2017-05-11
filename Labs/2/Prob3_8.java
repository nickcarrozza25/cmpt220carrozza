 /**
   * file: 3_8.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 3.8 for Lab 2.
   */
/**
   * Prob3_8
   * 
   * This class implements the driver for problem 3.8 for lab 2
   */



package Labs;

import java.util.Scanner;

public class Prob3_8 {

    public static void main(String[] args){

        System.out.print("Please enter your first integer: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        System.out.print("Please enter your second integer: ");

        int b = input.nextInt();

        System.out.print("Please enter your third integer: ");

        int c = input.nextInt();

        int firstPlace = 0;

        int secondPlace = 0;

        int thirdPlace = 0;


        if (a > b && b > c) {

            firstPlace = a;

            secondPlace = b;

            thirdPlace = c;

        } else if (a > c && c > b) {

            firstPlace = a;

            secondPlace = c;

            thirdPlace = b;

        } else if (b > a && a > c){

            firstPlace = b;

            secondPlace = a;

            thirdPlace = c;

        } else if (b > c && c > a) {

            firstPlace = b;

            secondPlace = c;

            thirdPlace = a;


        } else if (c > a && a > b) {

            firstPlace = c;

            secondPlace = a;

            thirdPlace = b;

        } else if (c > b && b > a) {

            firstPlace = c;

            secondPlace = b;

            thirdPlace = a;

        } else if (a == b && b > c) {

            firstPlace = c;

            secondPlace = b;

            thirdPlace = a;


        } else if (a == c && b < c) {

            firstPlace = c;

            secondPlace = a;

            thirdPlace = b;


        } else if (a == c && c < b) {

            firstPlace = b;

            secondPlace = a;

            thirdPlace = c;

        } else if (a == c && c > b) {

            firstPlace = c;

            secondPlace = a;

            thirdPlace = b;

        } else if (b == a && a > c ) {

            firstPlace = a;

            secondPlace = b;

            thirdPlace = c;

        } else if (b == a && a < c) {

            firstPlace = c;

            secondPlace = b;

            thirdPlace = a;


        } else if (b == c && c > a) {

            firstPlace = c;

            secondPlace = b;

            thirdPlace = a;

        } else if (b == c && c < a) {

            firstPlace = a;

            secondPlace = b;

            thirdPlace = c;

        } else if (a == b && b == c) {

            firstPlace = a;

            secondPlace = b;

            thirdPlace = c;


        }

        System.out.println(thirdPlace);

        System.out.println(secondPlace);

        System.out.println(firstPlace);


    }


}
