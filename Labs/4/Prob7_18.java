/*

 Created by nickcarrozza on 3/7/17.

 Problem 7.18 for Lab 4

 Bubble sort an array

*/

import java.util.Scanner;

import java.util.Arrays;


public class Prob7_18 {

    public static void main(String[] args){

        double[] list = new double[10];

        Scanner input = new Scanner (System.in);

         //loop to create an array of the stream of numbers a user inputs
        for (int x = 0; x < list.length; x++) {

            list[x] = input.nextDouble();

        }

        int y = 0;
            //create loop to run a nested loop "array.length" times
            while (y < list.length) {

                //create a nested loop to check if the current is less than the previous and swap
                for (int i = 1; i < list.length; i++) {

                    if (list[i] < list[i - 1]) {

                        //create a variable to hold the value of the previous value in the array
                        double place = list[i - 1];

                        // switch the current element with the previous
                        list[i - 1] = list[i];

                        //assign the previously created variable to the current element in the array
                        list[i] = place;

                    }

                }

                y++;

            }


        System.out.print(Arrays.toString(list));

    }

}
