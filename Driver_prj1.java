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

        /*for(int k = 0; k < cresult.length; k++){




        }*/



        System.out.println(Arrays.toString(alist));
        System.out.println(Arrays.toString(blist));
        System.out.println(Arrays.toString(aflip));

    }

}
