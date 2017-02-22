/*

 Created by nickcarrozza on 2/21/17.

-reads user input of integers, determines number of positive and negative numbers
-compute total and average (as float) of the input values
-Program ends with input 0


*/


import java.util.Scanner;

public class Prob5_1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;

        int next;

        int posCount = 0;

        int negCount = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        do {
            //counts the amount of numbers the user types
            next = input.nextInt();

            //checks to see if the integer is greater than one (Positive)
            if (next >= 1) {

                posCount++;

            //else increment negative number amount since it is negative by default
            } else {

                negCount++;

            }

            // add each number the user types to the total
            total += next;


        } while(next != 0);

        System.out.println("The number of positives is: " + posCount);

        System.out.println("The number of negatives is: " + negCount);

        System.out.println("The total is: " + total);


    }


}
