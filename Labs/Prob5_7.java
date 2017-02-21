package Labs;

/*

Problem 5.7

-increase tuition by 5% a year current is 10000 for ten years

-compute total cost of four years of tuition after the tenth year

*/

public class Prob5_7 {

    public static void main(String[] args){

        int status;

        double tuition = 10000;

        for (status = 1; status <= 10; status++) {

            tuition *= 1.05;

        }


        System.out.print("The value of a years tuition after ten years from today is: ");

        System.out.printf("%.2f\n", tuition);

        int check;


        for (check = 1; check <= 4; check ++) {

            tuition *= 1.05;

              System.out.print("The cost of tuition for year " + check + " is: ");

              System.out.printf("%.2f\n", tuition);

        }

        System.out.println();

    }

}