package Labs;

 /**
   * file: lab2Problem2.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 1, 2017
   * version: 1
   * 
   * This file contains the driver for problem 2 for Lab 2.
   */
/**
   * Lab2Problem2
   * 
   * This class implements the driver for problem 2 for lab 2
   */




import java.util.Scanner;

public class Lab2Problem2 {

    public static void main(String[] args) {

        System.out.println("Please enter the following as percentage ...");

        Scanner input = new Scanner(System.in);

        System.out.print("midterm exam: ");

        double midVal = input.nextDouble();

        System.out.print("final exam: ");

        double finalVal = input.nextDouble();

        System.out.print("projects: ");

        double projects = input.nextDouble();

        System.out.print("homework and labs: ");

        double hwLab = input.nextDouble();


        double avg = ((midVal * .2) + (finalVal * .2) + (projects * .2) + (hwLab * .4));

        String letter = null;


        if (avg >= 95) {

            letter = "A";

        } else if (avg >= 90 && avg < 95 ){

            letter = "A-";

        } else if (avg >= 87 && avg < 90){

            letter = "B+";

        } else if (avg >= 83 && avg < 87) {

            letter = "B";


        } else if (avg >= 80 && avg < 83 ){

            letter = "B-";

        } else if (avg >= 77 && avg < 80) {

            letter = "C+";

        } else if (avg >= 73 && avg < 77 ){

            letter = "C";

        } else if (avg >= 70 && avg < 73) {

            letter = "C-";


        } else if (avg >= 65 && avg < 70) {

            letter = "D+";


        } else if (avg >= 60 && avg < 65) {

            letter = "D";


        } else {

            letter = "F";
        }

        System.out.print("Your final grade is: " + letter);


    }

}
