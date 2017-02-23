/*

 Created by nickcarrozza on 2/22/17.

 Problem 6.2

 This program allows the user to input an integer and adds the sum of its digits.

*/

import java.util.Scanner;


public class Prob6_2 {

    public static int sumDigits(long n) {

        long userInt = n;

        int sum = 0;


        while (userInt > 0) {

            long place = userInt % 10;

            sum += (int) place;


            userInt = userInt / 10;

        }

        return sum;

    }


    public static void main(String[] args) {

        System.out.print("Enter an integer: ");

        Scanner input = new Scanner(System.in);

        //make this long not int

          long userInt = input.nextLong();

        //invoke sumDigits here

          int ans = sumDigits(userInt);

          System.out.println("The sum of the digits in your integer is: " + ans);


    }
}
