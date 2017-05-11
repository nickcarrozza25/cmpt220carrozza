 /**
   * file: 4_25.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.25 for Lab 2.
   */
/**
   * Prob4_25
   * 
   * This class implements the driver for problem 4.25 for lab 2
   */




import java.util.Scanner;
import java.lang.Math;

public class Prob4_25 {

    public static void main(String[] args) {

        /*
        algorithm "genRand" I made myself to generate a random number between 0 and 100
        take the floor of this double to make an integer that will be checked to correspond wth
        ASCII values
        */

        //generate three random integers between 65 and 122

        for (int i = 0; i < 3; i++) {
            //value go is used to ensure the random int being generated is between 65 and 90
            boolean go = true;

            while (go) {

                double genRand = Math.floor((Math.random() * 100));

                if (genRand >= 65 && genRand <= 90) {

                    go = false;

                    int randomASC = (int) genRand;

                    System.out.print((char) randomASC);
                }
            }
        }

        //generate four random digits, numbers between 0 and 9, use floor to avoid decimals;
        for (int j = 0; j < 4; j++) {

            double randNum = Math.floor(Math.random() * 10);

            int randInt = (int)randNum;

            System.out.print(randInt);


        }
    }
}
