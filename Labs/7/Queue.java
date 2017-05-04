/**
 * file: Queue.java
 * author: Nick Carrozza
 * course: CMPT 220
 * assignment: Lab 7, Problem 10.10
 * due date: April 27, 2017
 * version: 1
 *
 * This file contains the creation of the Queue class
 */

/**
 * Queue
 *
 * This class implements a Queue with elements, has a given size and
 * various methods that can be performed
 */

public class Queue {

  //data fields for queue class

  //determines number of elements in queue, initialize to 8
  int size = 8;

  //create the elements array that holds all the elements in the queue
  int[] elements = new int [size];

  //main method
  public static void main(String[] args){

  }

  //default constructor
  Queue(){

  }

  //method enqueue to add things to the queue
  void enqueue (int v){

    if(size >= elements.length){

      int[] transferArray = new int [elements.length * 2];

      System.arraycopy(elements, 0, transferArray, 0, elements.length);

    }

  }

  int dequeue(){

    //declare variable that removes an element from the queue
     int removed = elements[0];

     //loop that takes every element in the queue and shifts it one position to the left
    //a.k.a., remove one and recreate array starting with second element

    for(int i = 1; i < elements.length; i++){

      elements[i - 1] = elements[i];

    }

    return removed;
  }

  //method isEmpty returns true if queue is empty
  boolean empty(){

    boolean isEmpty = false;

    if (elements.length == 0){

      isEmpty = true;

    }

    return isEmpty;
  }

  //method that returns the size of the queue
  int getSize(){

    return size;
  }


}
