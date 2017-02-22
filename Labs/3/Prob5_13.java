/*

 Created by nickcarrozza on 2/21/17

 Problem 5.13

 find the largest integer such that n^2 is less than 12000

 */


public class Prob5_13 {

    public static void main(String[] args) {

        int n = 0;

        //compute the square of n until 12000 is reached

        while ((n * n) <= 12000){

            n++;

        }

        //must subtract by one to handle the additional increment before the while loop is exited

        System.out.println("The largest integer whose square is less than 12000 is: " + (n - 1));

        System.out.println("The value of " + n + "^2 is " + ((n - 1) * (n - 1)));

    }
}
