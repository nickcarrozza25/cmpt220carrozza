  /**
   * file: Prob7_32v1.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 30, 2017
   * version: 2.1
   * 
   * This file contains the driver and main method for 
   * problem 7.32.
   */


/**
   * Prob7_32v1
   * 
   * This class declares the driver and includes main method for running 
   * problem 7.32. 
   */


import java.util.Scanner;
import java.util.Arrays;


    public class Prob7_32v1 {

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

          int qty = input.nextInt();

          int[] list = new int[qty];

          int i = 0;

          while (i < qty) {

            int user = input.nextInt();

            list[i] = user;

            i++;

          }

            int pivot = list[0];

            int highCount = 0;

            int lowCount = 0;


            //need to count how many are higher and how many are lower in order to determine size
            //of the lower values array and higher values array

            for(int j = 1; j < list.length; j++) {

              if (list[j] > pivot){

                highCount++;

              } else {

                  lowCount++;
              }

            }

            int[] before = new int[lowCount];

            int[] after = new int[highCount];

            //keep track of the indecies of the before and after arrays
            int bIdx = 0;
            int aIdx = 0;

            for (int j = 1; j < list.length; j++) {

              if (list[j] <= pivot){
                //place it in the before array

                  before[bIdx] = list[j];

                  bIdx++;

                } else {

                  after[aIdx] = list[j];

                  aIdx++;

                }

            }

            //sort the arrays to prepare for the concatenation of before and after arrays
            Arrays.sort(before);
            Arrays.sort(after);

            int[] result = new int[before.length + after.length + 1];

            //create a track variable to check what position in the result array you are in
            int track = 0;



            //first loop created to fill result array for before values
            for (int k = 0; k < before.length; k++){

              result[k] = before[k];

              track++;

            }

            //next, the very next position in the result gets the pivot value

            result[before.length] = pivot;

            //add one to track to account for the assigning of pivot to the next value
            track++;

            //second loop is to complete the result array filling in the after values
            for (int l = 0; l < after.length; l++){

              result[track] = after[l];

              track++;
            }


            System.out.println(Arrays.toString(result));

        }
}
