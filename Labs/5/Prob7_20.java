  /**
   * file: Prob7_20.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 30, 2017
   * version: 1.2
   * 
   * This file contains the declaration of the 
   * SinglyLinkedList abstract data type.
   */


/**
   * Prob7_20
   * 
   * This class declares the driver and includes main method for running 
   * problem 7.20. 
   */

import java.util.Scanner;
import java.util.Arrays;

public class Prob7_20 {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double[] userArray = new double[10];

    System.out.print("Please enter an array of ten values: ");

    //create the user array of exactly ten elements
    for (int i = 0; i < 10; i++){

      double nextVal = input.nextInt();

      userArray[i] = nextVal;

     }

     System.out.println(Arrays.toString(userArray));

        //nested for loop to sort the array

        int maxIdx;

        int arrayLength = userArray.length - 1;

          for (int i = 0; i < arrayLength; i++){

            maxIdx = 0;

          for (int j = 0; j < arrayLength - i; j++){

            if(userArray[j] > userArray[maxIdx]){

              maxIdx = j;

            }

          }

          double capture = userArray[maxIdx];

          userArray[maxIdx] = userArray[arrayLength - i];

          userArray[arrayLength - i] = capture;

          System.out.println(Arrays.toString(userArray));



        }


      //System.out.println(Arrays.toString(userArray));


    }

}



