/*

Created by nickcarrozza on 2/22/17.

For this problem, write a program to compute the p-norm
distance between pairs of points, for a given value of p.

*/



import java.util.Scanner;

import java.lang.Math;

public class Driver_lab3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

          while (count < 1000) {

                  double a = input.nextDouble();

                  // if the first number the user types is a 0

                  if (a == 0) {

                      break;

                  //otherwise take in the next four numbers and compute the answer

                  } else {

                      double c = input.nextDouble();

                      double b = input.nextDouble();

                      double d = input.nextDouble();

                      double p = input.nextDouble();

                      count++;


                      if (a < 100 && b < 100 && c < 100 && d < 100 && p < 100) {

                          double xDist = Math.abs(b - a);

                          double xTop = Math.pow(xDist, p);

                          double yDist = Math.abs(d - c);

                          double yTop = Math.pow(yDist, p);

                          double xPlusy = xTop + yTop;

                          double ans = Math.pow(xPlusy, (1 / p));

                          System.out.printf("%.10f\n", ans);
                      }

                  }


            }


      }


}






