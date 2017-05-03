/*
Lab 6
Problem 9.13
Design a location class with row, column and maxValue as data fields

*/


import java.util.Scanner;
import java.util.Arrays;

public class Location {

    //data fields for Location class
    int row = 0;

    int column = 0;

    double maxValue = 0;

    public static void main(String[] args) {

        Scanner rolCol = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");

        int rowInput = rolCol.nextInt();

        int colInput = rolCol.nextInt();

        //create new instance of location
        Location loc1 = new Location();

        //assign the users input for row and column to the row and column of loc1
        loc1.row = rowInput;

        loc1.column = colInput;

        double[][] list = new double[rowInput][colInput];

        Scanner matrixInput = new Scanner(System.in);

        System.out.print("Enter the matrix: ");

        //nested for loop to create the user matrix "list"
        for(int i = 0; i < rowInput; i++){

            for(int j = 0; j < colInput; j++){

                double matrixValue = matrixInput.nextDouble();

                list[i][j] = matrixValue;

            }

        }


        //call the locateLargest method on the list matrix, which is what the user enters
        loc1.locateLargest(list);

        System.out.println(locateLargest(list));

    }


    //create the components of the Location object

    //default constructor
    Location() {

    }

    //create instance of the location object "loc1"
   // Location loc1 = new Location();



    //method to locate the largest element in the matrix

    public static Location locateLargest(double[][] a) {

        int i;

        //declare variables to keep track of
        int rowIdx = 0;


        //declare variables to capture index at the max value
        int maxrowIdx = 0;

        int maxcolIdx = 0;


        double maxValue;


        //nested loop to compare the max value to every element in the array
        for (int h = 0; h < a.length; h++) {

            for (i = 0; i < a[rowIdx].length; i++) {

                maxValue = a[rowIdx][0];

                if (a[rowIdx][i] > maxValue) {

                    maxValue = a[rowIdx][i];

                    maxrowIdx = rowIdx;

                    maxcolIdx = i;
                }

            }

            rowIdx++;
        }



       return new Location();
    }
}
