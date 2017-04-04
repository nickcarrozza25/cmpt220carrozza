/*

Nick Carrozza CMPT220

Lab 5 - Problem 7.31

Sort two user input arrays using a method

*/

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class Prob7_31 {

    public static void main(String[] args){

        //create first instance of scanner to allow for first stream of numbers
        Scanner firstList = new Scanner (System.in);

        System.out.print("Enter list1: ");

          int firstQty = firstList.nextInt();

          int[] list1 = new int[firstQty];

            //loop to read in the second stream of user input and create second array
            for (int i = 0; i < list1.length; i++ ){

              int userFirst = firstList.nextInt();

              list1[i] = userFirst;

              }

          //create second instance of the scanner object to allow for second stream of input
          Scanner secondList = new Scanner (System.in);

          System.out.print("Enter list2: ");

          int secQty = secondList.nextInt();

          int[] list2 = new int[secQty];

            //loop to read in the second stream of user input and create second array
            for (int j = 0; j < list2.length; j++ ){

                int userSec = secondList.nextInt();

                list2[j] = userSec;

             }

        //print out the result array created

        System.out.print(Arrays.toString(merge(list1, list2)));


    }


    //create method to take in two arrays as parameters and return the result of joining
    //and sorting the two
    public static int[] merge(int[] first, int[] second){


        //create the result array the same size as the first + second
        int[] result = new int[first.length + second.length];


          //loop to fill in the result array with values from the first array
          for (int k = 0; k < first.length; k++){

            result[k] = first[k];

          }

          //create a check variable to allow for the correct index of the second array to
          //be placed in the result array
          int check = 0;

          //loop to fill in second array created to the result array, beginning where the
          //first left off
          for (int l = first.length; l < result.length; l++){

            result[l] = second[check];

            check++;

          }

         //sort the result array
         Arrays.sort(result);


        return result;
    }

}
