/**
 * Created by nickcarrozza on 3/24/17.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class Driver_prj1 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int alength = input.nextInt();

        int blength = input.nextInt();

        int[] alist = new int[alength];

        int[] blist = new int[blength];

        //loop to create first array user types in

        for(int i = 0; i < alength; i++){

            int nexta = input.nextInt();

            alist[i] = nexta;

        }

        //loop to create second array the user types in

        for(int j = 0; j < blength; j++){

            int nextb = input.nextInt();

            blist[j] = nextb;

        }

        //code to flip the first array (flip lista)
        int[] aflip = new int[alength];

        int m = 1;

        for(int l = 0; l < alist.length; l++) {

            aflip[l] = alist[alength - m];

            m++;

        }

        //create the result array and declare its size by calculating
        int resLength = (alength + blength) - 1;

        int[] cresult  = new int[resLength];

        for(int idx = 0; idx < resLength; idx++){

            //int shift = 0;

            //run the following loop the "blength" amount of times, or run for every element present in the second loop
            for(int shift = 0; shift < blength; shift++){

                /*
                for the first position in the result array (monitored with idx), take the first position in
                  the second array and multiply it by the last position in the flipped array
                  idx - shift is used to always account for/ find the last position in the flipped array
                  as it moves across the stationary or second one
                */

                try{

                    cresult[idx] += aflip[shift] * blist[idx - shift];


                } catch (ArrayIndexOutOfBoundsException e) {

                    //if the array is out of bounds, add nothing to it and keep going
                    cresult[idx] += 0;

                }

            }

        }

        for (int n = 0; n < resLength; n++){

         System.out.print(cresult[n] + " ");


        }

    }

}
