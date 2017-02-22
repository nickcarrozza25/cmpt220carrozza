/*

 Created by nickcarrozza on 2/21/17.

 Problem 6.1

 Return a pentagonal number

*/

public class Prob6_1 {

    public static int getPentagonalNumber(int n) {


            n = ((n * ((3 * n) - 1)) / 2);

        return n;
    }

    public static void main(String[] args) {

        int count = 1;

        //repeat code 100 times
        while (count <=  100) {

                //once 10 numbers are printed, println to begin new line
                if (count % 10 == 0) {

                    System.out.println(getPentagonalNumber(count) + " ");


                } else {

                    System.out.print(getPentagonalNumber(count) + " ");

                }

                count++;

        }

    }




}


