package Labs;

/*

  Created by nickcarrozza on 2/6/17.

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

        System.out.println(month);

        switch (month) {


            case "January":

                numDays = 31;

                break;

            case "February":

                numDays = 28;

            case "March":

                numDays = 31;


        }

             System.out.println(numDays);





    }

}
