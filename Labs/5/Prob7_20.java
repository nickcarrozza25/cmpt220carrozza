/**
 * Created by nickcarrozza on 3/29/17.
 */


import java.util.Scanner;
import java.util.Arrays;

public class Prob7_20 {

    public static void main(String[] args){

     Scanner input = new Scanner(System.in);

     double[] list = new double[10];

     double[] result = new double[10];

     //create the users array
     for(int k = 0; k < list.length; k++){

         double userNum = input.nextDouble();

         list[k] = userNum;

     }


     //determine the max element in the users array
        double maxel = list[0];

        for(int i = 1; i <= list.length; i++) {


            for (int j = 0; j < list.length - i; j++) {

                if (list[j] > maxel) {

                    maxel = list[j];

                    result[result.length - i] = maxel;

                } else {

                    result[result.length - i] = list[j];
                }

            }



        }

        System.out.print(maxel);
       System.out.print(Arrays.toString(list));
        System.out.print(Arrays.toString(result));



     }

}

