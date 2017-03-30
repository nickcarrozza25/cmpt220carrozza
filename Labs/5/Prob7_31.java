/**
 * Created by nickcarrozza on 3/29/17.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Prob7_31 {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int[] a = new int[5];

        int[] b = new int[5];

        for (int k = 0; k < a.length; k++){

            int usera = input.nextInt();

            a[k] = usera;
        }

        for (int l = 0; l < b.length; l++){

            int userb = input.nextInt();

            b[l] = userb;
        }


        System.out.print(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.print(Arrays.toString(merge(a,b)));

    }


    public static int[] merge(int[] list1, int[] list2){

        int[] merged = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++){

            merged[i] = list1[i];


        }

        int check = 0;

        for (int j = list1.length; j < merged.length; j++) {


            merged[j] = list2[check];

            check++;

        }

        Arrays.sort(merged);

        return merged;
    }


}

