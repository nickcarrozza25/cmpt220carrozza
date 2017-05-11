/**
   * file: Rectangle.java
   * author: Nick Carrozza
   * course: CMPT 220
   * assignment: Lab 6, Problem 9.1
   * due date: April 20, 2017 
   * version: 1 
   * 
   * This file contains the code for the creation of 
   * an class Rectangle 
   */

/**
   * Rectangle
   * 
   * This class implements a blueprint for creating a rectangle 
   * with data types width and height, for instance 
   */

public class Rectangle {

//data fields for the Rectangle class of objects
  double width = 1;

  double height = 1;

  public static void main(String[] args){

    //create first rectangle "rect1"
    Rectangle rect1 = new Rectangle();

      rect1.height = 40;

      rect1.width = 4;

      //print information for first rectangle
        System.out.println(rect1.height);
        System.out.println(rect1.width);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        //create second rectangle rect2

        Rectangle rect2 = new Rectangle();

          rect2.height = 35.9;

          rect2.width = 3.5;

            //print information for second rectangle
            System.out.println(rect2.height);
            System.out.println(rect2.width);
            System.out.println(rect2.getArea());
            System.out.println(rect2.getPerimeter());

  }


  /* Create the Rectangle object to be used in the main method */

    //create a default rectangle constructor
      Rectangle() {

      }

    //create a rectangle constructor with a new width and new height as parameters

       Rectangle(double newWidth, double newHeight) {

         width = newWidth;

         height = newHeight;
      }

     //return the area of the rectangle
      double getArea() {

        return height * width;
    }

     //return the perimeter of the rectangle
      double getPerimeter() {

        return (2 * width) + (2 * height);

    }

}


