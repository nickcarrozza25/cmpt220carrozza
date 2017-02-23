/*

  Created by nickcarrozza on 2/22/17.

*/

import java.util.Scanner;

public class Prob6_3 {


    public static int reverse(int number) {

        int ans;

        // declare a string variable to allow each digit to be extracted and captured there

        String theNum = "";

        while (number > 0) {

            ans = number % 10;

            number /= 10;

            theNum += Integer.toString(ans);

        }

// before returning, convert to integer and return that integer (int)

        ans = Integer.parseInt(theNum);

        return ans;

    }


    public static boolean isPalindrome(int number){

        boolean isPal;


       if(reverse(number) == number) {

           isPal = true;

           System.out.print("Your number is, indeed, a palindrome, the reverse being " + reverse(number));


       } else {

           isPal = false;

           System.out.println("Your number " + number + " is not a palindrome.");

       }


        return isPal;
    }


    public static void main(String[] args) {

        System.out.print("Please enter an integer: ");

        Scanner input = new Scanner (System.in);

        int number = input.nextInt();

        reverse(number);

        isPalindrome(number);

    }

}


