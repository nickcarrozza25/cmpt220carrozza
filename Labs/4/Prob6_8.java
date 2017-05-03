  /**
   * file: Prob6_8.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 3, 2017
   * version: 1
   * 
   * This file contains the driver and main method for 
   * problem 8.13 for lab 4
   */


/**
   * Prob6_8
   * 
   * This class declares the driver and includes main method for running 
   * problem 6_8. 
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
