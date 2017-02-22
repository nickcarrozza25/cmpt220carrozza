/*

 Created by nickcarrozza on 2/21/17.

*/

import java.lang.Math;

public class Prob5_12 {

    public static void main(String[] args){

        int n = 0;


        while ((n*n) <= 12000) {

            n++;

        }

        System.out.println("The smallest integer whose square is greater than 12000 is: " + (n + 1));

        System.out.println("The value of " + (n + 1) + "^2 is : "  + (n + 1) * (n + 1));


    }

}
