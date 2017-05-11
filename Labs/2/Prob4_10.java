 /**
   * file: 4_10.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 4.10 for Lab 2.
   */
/**
   * Prob4_10
   * 
   * This class implements the driver for problem 4.10 for lab 2
   */





import java.util.Scanner;

public class Prob4_10 {

    public static void main(String[] args){

        //define all 5 sets of numbers
        String set1 =

                 " 1 3 5 7      \n" +
                 " 9 11 13 15   \n" +
                 " 17 19 21 23  \n" +
                 " 25 27 29 31     ";

         String set2 =
                " 2 3 6 7       \n" +
                " 10 11 14 15   \n" +
                " 18 19 22 23   \n" +
                " 26 27 30 31      ";

        String set3 =

                 " 4 5 6 7      \n" +
                 " 12 13 14 15  \n" +
                 " 20 21 22 23  \n" +
                 " 28 29 30 31     ";

        String set4 =

                " 8 9 10 11    \n" +
                " 12 13 14 15  \n" +
                " 24 25 26 27  \n" +
                " 28 29 30 31     ";

        String set5 =

                " 16 17 18 19     \n" +
                " 20 21 22 23     \n" +
                " 24 25 26 27     \n" +
                " 28 29 30 31        ";

        //declare int to keep track of the day
        int day = 0;

        Scanner input = new Scanner(System.in);

        //prompt the user for info about set 1
        System.out.println("Is your birthday in Set 1?");

        System.out.println(set1);

        System.out.println("Enter 'N' for No and 'Y' for Yes: ");

        String answer1 = input.nextLine();

          if (answer1.equals("Y")) {

            day += 1;

           }

        //prompt the user for info about set 2
        System.out.println("Is your birthday in Set 2?");

        System.out.println(set2);

        System.out.println("Enter 'N' for No and 'Y' for Yes: ");

        String answer2 = input.nextLine();

          if (answer2.equals("Y")) {

            day += 2;

          }

        //prompt the user for info about set 3
        System.out.println("Is your birthday in Set 3?");

        System.out.println(set3);

        System.out.println("Enter 'N' for No and 'Y' for Yes: ");

        String answer3 = input.nextLine();

          if (answer3.equals("Y")) {

            day += 4;

          }

        //prompt the user for info about set 4
        System.out.println("Is your birthday in Set 4?");

        System.out.println(set4);

        System.out.println("Enter 'N' for No and 'Y' for Yes: ");

        String answer4 = input.nextLine();

          if (answer4.equals("Y")) {

            day += 8;

          }

        //prompt the user for info about set 5
        System.out.println("Is your birthday in Set 5?");

        System.out.println(set5);

        System.out.println("Enter 'N' for No and 'Y' for Yes: ");

        String answer5 = input.nextLine();

          if (answer5.equals("Y")) {

            day += 16;

          }


        System.out.println("Your birthday is " + day + "!");


    }


}
