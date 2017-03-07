/*

 Created by nickcarrozza on 3/6/17.

Problem 6.20 for Lab 4

Write a program to return the

*/


import java.util.Scanner;
import java.io.*;


public class Prob6_20 {

    //main method

    public static void main(String[] args) {

        System.out.print("Please enter a string: ");


        Scanner input = new Scanner (System.in);

        String userString = input.next();

        //invoke the count letters method

        System.out.print(countLetters(userString));


    }

    //method to find the length of the string "s" the user inputs

    public static int countLetters(String s) {

        return s.length();
    }

}
