

/*

 Created by nickcarrozza on 2/7/17.

*/




import java.util.Scanner;


public class Prob4_1 {

    public static void main (String[] args) {

        System.out.print("Enter the length from the center to the vertex: ");

        Scanner input = new Scanner (System.in);

        double radius = input.nextDouble();

        double side = (2 * radius * (Math.sin(Math.PI / 5)));

        double area = ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));

        // to round the answer to two decimal places

        double ans = (Math.round(area * 100) / 100.0);

        System.out.printf("The area of the pentagon is " + ans);

    }


}

