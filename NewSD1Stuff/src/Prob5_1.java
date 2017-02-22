/*

Problem 5.1

reads user input of integers, determines number of positive and negative numbers
compute total and average (as float) of the input values
Program ends with input 0

*/


import java.util.Scanner;



public class Prob5_1 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter an integer. Input ends with a 0: ");

            next = input.nextInt();

            total += next;


        } while(next != 0);

        System.out.print("The total is: " + total);



    }


}