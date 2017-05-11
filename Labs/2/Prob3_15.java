 /**
   * file: 3_15.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 3.15 for Lab 2.
   */
/**
   * Prob3_15
   * 
   * This class implements the driver for problem 3.15 for lab 2.
   */



import java.util.Scanner;


public class Prob3_15 {

    public static void main(String[] args) {

    System.out.print("Please enter a positive three digit number: ");

    Scanner input = new Scanner (System.in);

    int userNum = input.nextInt();

    int randNum = (int)(Math.random() * 1000);

    int status = 0;

    if (randNum == 1000) {

        while (randNum == 1000) {

            int newNum = (int)(Math.random() * 1000);

            randNum = newNum;

         }

    } else if (randNum < 100) {

        while (randNum < 100) {

            int newNum = (int) (Math.random() * 1000);

            randNum = newNum;
        }
    }

        System.out.println( "The random lottery number is: " + randNum);

    if (userNum > 999 || userNum < 100) {

          System.out.println(userNum + " is not a positive three digit number. Try again.");


    } else { //code to check if random number equals user number

        // to retrieve random digits

          int randOne = (randNum / 100);

          int randTwo = (randNum / 10);

          int randThree = (randNum % 10);

        //to retrieve user numbers digits


          int userOne = (userNum / 100);

          int userTwo = ((userNum / 10) % 10);

          int userThree = (userNum % 10);

            //place holder to set up switch case logic


            if (userNum == randNum) {

                // to win 10000 dollars

                status = 1;

            } else if ( (userOne == randOne || userOne == randTwo || userOne == randThree)

                    && (userTwo == randTwo || userTwo == randOne || userTwo == randThree)

                    && (userThree == randThree || userThree == randOne || userThree == randTwo)) {

                // to win 3000 dollars

                status = 2;

            } else if ((userOne == randOne || userOne == randTwo || userOne == randThree)

                    || (userTwo == randTwo || userTwo == randOne || userTwo == randThree)

                    || (userThree == randThree || userThree == randOne || userThree == randTwo) ) {

                // to win 1000 dollars

                status = 3;
            }

        }

            switch (status) {

                case 1:

                    System.out.println("Congrats, you've won $10,000!");

                    break;

                case 2:

                    System.out.println("Congrats, you've won $3,000!");

                    break;

                case 3:

                     System.out.println("Congrats, you've won $1,000!" );

                     break;

                default:

                    System.out.println("Sorry, you didn't win anything");

            }


      }

}


/*

((userOne == randOne)     && ((userOne != randTwo)   && (userOne != randThree)))

        || ((userOne == randTwo)     && ((userOne != randOne)   && (userOne != randThree)))

        || ((userOne == randThree)   && ((userOne != randTwo)   && (userOne != randOne)))

        || ((userTwo == randOne)     && ((userTwo != randTwo)   && (userTwo != randThree)))

        || ((userTwo == randTwo)     && ((userTwo != randOne)   && (userTwo != randThree)))

        || ((userTwo == randThree)   && ((userTwo != randTwo)   && (userTwo != randOne)))

        || ((userThree == randOne)   && ((userThree != randTwo) && (userThree != randThree)))

        || ((userThree == randTwo)   && ((userThree != randOne) && (userThree != randThree)))

        || ((userThree == randThree) && ((userThree != randOne) && (userThree != randTwo)))


*/