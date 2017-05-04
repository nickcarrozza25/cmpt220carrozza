/**
 * file: Queue_Driver.java
 * author: Nick Carrozza
 * course: CMPT 220
 * assignment: Lab 7, Problem 10.10
 * due date: April 27, 2017
 * version: 1
 *
 * This file contains the driver for the Queue class
 * problem 10.10 for lab 7
 */


import java.util.Arrays;

public class Queue_Driver {

  public static void main(String[] args){

    //create new instance of queue
    Queue elemList = new Queue();

    //declare data fields for elemList instance
    elemList.size = 20;

    elemList.elements = new int[20];

    //loop to run elemList.elements.length times and create the array
    for (int i = 1; i <= elemList.elements.length; i++){

      //add i to the Queue we created
      elemList.elements[i - 1] = i;

    }

    //loop to dequeue "remove" elements from the Queue and display them
    for(int j = 0; j < elemList.elements.length; j++){

      //print each element that is removed
      System.out.println(elemList.dequeue());

    }

  }

}
