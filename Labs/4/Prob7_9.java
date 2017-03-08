/*

Created by nickcarrozza on 3/6/17.

*/


import java.util.Scanner;



public class Prob7_9 {

    public static void main(String[] args) {

        System.out.print("Please enter a stream of numbers: ");

        Scanner input = new Scanner(System.in);

        double[] list = new double[10];

        // create for loop to read any and all of the users typed in numbers
        for(int i = 0; i < 10; i++){

            double value = input.nextDouble();

            list[i] = value;

        }

        // assign minimum value to the first element in the array so that when the search begins it begins with
        // the element in the first position

        double minVal = list[0];

        //create loop to find the minimum
        for(int i = 1; i < list.length; i++){

            if (list[i] < minVal){

               minVal = list[i];
            }
        }

        System.out.println(minVal);
    }

}


