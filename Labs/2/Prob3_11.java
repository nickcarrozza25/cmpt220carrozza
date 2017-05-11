package Labs;

 /**
   * file: 3_11.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 3.11 for Lab 2.
   */
/**
   * Prob3_11
   * 
   * This class implements the driver for problem 3.11 for lab 2
   */



        import java.util.Scanner;

public class Prob3_11 {

    public static void main(String[] args) {

        System.out.print("Please enter the number for a month: ");

        Scanner input = new Scanner(System.in);

        int monthNum = input.nextInt();

        System.out.print("Please enter a four digit year value: ");

        int year = input.nextInt();

        int numDays = 0;

        String month = null;

        switch (monthNum) {

            case 1:

                month = "January";

                break;

            case 2:

                month = "February";

                break;

            case 3:

                month = "March";

                break;

            case 4:

                month = "April";

                break;

            case 5:

                month = "May";

                break;

            case 6:

                month = "June";

                break;

            case 7:

                month = "July";

                break;

            case 8:

                month = "August";

                break;

            case 9:

                month = "September";

                break;


            case 10:

                month = "October";

                break;

            case 11:

                month = "November";

                break;

            case 12:

                month = "December";

                break;

        }

        switch (month) {


            case "January":

                numDays = 31;

                break;

            case "February":

                if (year % 4 == 0) {

                    numDays = 29;

                } else {

                    numDays = 28;

                }

                break;

            case "March":

                numDays = 31;

                break;

            case "April":

                numDays = 30;

                break;

            case "May":

                numDays = 31;

                break;

            case "June":

                numDays = 30;

                break;

            case "July":

                numDays = 31;

                break;

            case "August":

                numDays = 31;

                break;

            case "September":

                numDays = 30;

                break;

            case "October":

                numDays = 31;

                break;

            case "November":

                numDays = 30;

                break;

            case "December":

                numDays = 31;

                break;

        }

        if (year > 2017) {

            System.out.println(month + " " + year + " will have " + numDays + " days");

        } else {

            System.out.println(month + " " + year + " had " + numDays + " days");


        }

    }
}
