/*

Created by nickcarrozza on 3/6/17.

Problem 6.8 for Lab 4

Create a program with two methods to calculate conversion tables for celcius and fahrenheit

*/


public class Prob6_8 {

    //method to convert from celcius to farenheit

    public static double celciusToFahrenheit(double celcius) {

        double fahrenheit = (9.0 / 5) * celcius + 32;

        return fahrenheit;

    }

    // method to convert from fahernheit to celcius

    public static double fahrenheitToCelcius(double fahrenheit) {

        double celcius = (5.0 / 9) * (fahrenheit - 32);

        return celcius;

    }

    public static void main(String[] args) {

        double celCount;

        double fahCount;

        //loop to display celcius values and invoke method to calculate corresponding fahrenheit values

        for (celCount = 40; celCount >= 31; celCount--) {

            System.out.print(celCount + " ");

            System.out.print(celciusToFahrenheit(celCount) + "\n");


        }

          System.out.print("\n");

        //loop to display celcius values and invoke method to calculate corresponding fahrenheit values

        for (fahCount = 120; fahCount >= 30 ; fahCount--) {

            System.out.print(fahCount + " ");

            System.out.print(fahrenheitToCelcius(fahCount) + "\n");

        }

    }
}
