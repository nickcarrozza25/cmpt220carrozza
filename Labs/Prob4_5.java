package Labs;

/*

 Created by nickcarrozza on 2/7/17.

*/

import java.util.Scanner;


public class Prob4_5 {

    public static void main(String[] args){

        System.out.print("Enter the number of sides: ");

        Scanner input = new Scanner(System.in);

        double numSides = input.nextDouble();

        System.out.print("Enter the side: ");

        double sideLength = input.nextDouble();

        double area = (numSides * (Math.pow(sideLength, 2))) / ( 4 * (Math.tan((Math.PI) / numSides)));

        System.out.println("The area of the polygon is: " + area);
        

    }


}
