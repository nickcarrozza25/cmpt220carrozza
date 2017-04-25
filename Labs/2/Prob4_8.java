/*
  Lab 2
  Problem 4.8
  Convert user input integer to ASCII code

*/


import java.util.Scanner;

public class Prob4_8 {

    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("Please enter a ASCII Code: ");

       int userInt = input.nextInt();

       System.out.print("The character for ASCII Code " + userInt + " is " + (char)userInt);


    }

}
