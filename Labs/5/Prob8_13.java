/*

  Problem 8.13 for Lab 7

  

*/

import java.util.*;
import java.lang.Math;


public class Prob8_13 {

    public static void main(String[] args) {

        Scanner rowCol = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");

        int rows = rowCol.nextInt();

        int col = rowCol.nextInt();

        double[][] matrix = new double[rows][col];

        Scanner elements = new Scanner(System.in);

        System.out.print("Enter the array: ");

        /* Create the Matrix:
        nested for loop to create the matrix, beginning with filling the first row
        for col # of times then moving down a row and doing the same. Begin by intializing
        a row and col count to assign the next user input value to the next position in the
        matrix.
        */

        int rowCount = 0;

        int colCount;

        for (int i = 0; i < rows; i++) {

            colCount = 0;

            for (int j = 0; j < col; j++) {

                double userElem = elements.nextDouble();

                matrix[rowCount][colCount] = userElem;

                colCount++;

            }

            rowCount++;

        }

        //not sure why this prints wierd hexidecimal stuff | matrix code works though
        //System.out.println(Arrays.toString(matrix));

        /* Search through the matrix to find the largest element in each row, then
        push that value to a new array which will be used to determine the largest
        element in the entire matrix. Length equal to the number of rows mathematical
        certainty.
        */

        //initialize maximum value checker to the first position in the matrix
        double currentMax;

        double[] highest = new double[rows];

        for (int k = 0; k < rows; k++) {

            //initialize the current max at each iteration to the element in the
            //first position at the given k row
            currentMax = matrix[k][0];

            for (int l = 0; l < col; l++) {

                if (matrix[k][l] > currentMax) {

                    currentMax = matrix[k][l];
                }

            }

            highest[k] = currentMax;

        }

        //create a loop to determine the largest element in the "highest" array

        //initialize the max checker variable to 0
        double highMax = highest[0];

         for (int m = 1; m < highest.length; m++) {

            if (highest[m] > highMax) {

                highMax = highest[m];

             }

         }

        /* Determine the position of the max element:
        -create a boolean variable to determine whether it is reached or not
        -nested for loop necessary to travel through a given row a column number
        of times
        */

        //initialize max checker to false
          int val1 = 0;

          int val2 = 0;

          int n = 0;

          int p = 0;

        //create loop to check at what index the max element exists at
        //determine the position where the current value equals highMax\


            for(n = 0; n < rows; n++) {

                    for (p = 0; p < col; p++) {

                            if (matrix[n][p] == highMax) {

                                val1 = n;

                                val2 = p;

                            }
                         }

                     }

        System.out.println("The location of the largest element is at: (" + val1 + "," + val2 + ")");

    }

}





