// Title: (StorageUnitOrganizer, linkedboxlist class)
// Course: (CS 300, Summer, and 2020)
//
// Author: (Gowham Saravanan)
// Email: (your gsaravanan@wisc.edu email address)
// Lecturer's Name: Mouna Kacem
// Persons: (NONE)
// Online Sources: (NONE)

import java.util.LinkedList;

/**
 * This class represents the linked box nodes list for the storage unit organizer
 * 
 */

public class LinkedBoxList {
  private LinkedBoxNode head; // head of this LinkedBoxList (refers to the element
  // stored at index 0 within this list)
  private int size; // number of boxes already stored in this list
  private int capacity; // capacity of this LinkedBoxList
  // maximum number of box elements that this LinkedBoxList
  // can store

  /**
   * 
   * Creates an empty LinkedBoxList with a given initial capacity
   * 
   * @param capacity is the number of spaces available to be filled
   */

  public LinkedBoxList(int capacity) {


    this.capacity = capacity;

  }

  /**
   * 
   * Returns the size of this list
   */

  public int size() {


    return this.size;

  }

  /**
   * 
   * Return the capacity of this list
   */


  public int getCapacity() {

    return this.capacity;
  }

  /**
   * Expands the capacity of this LinkedBoxList with the specified number a of additional elements
   * 
   * @param a is the number of spaces to increase by
   */

  public void expandCapacity(int a) {

    this.capacity += a;
  }

  /**
   * Checks whether this LinkedBoxList is empty returns true if this LinkedBoxList is empty, false
   * otherwise
   * 
   */

  public boolean isEmpty() {

    if (this.size == 0) {

      return true;
    }
    return false;
  }


  /**
   * Checks whether this LinkedBoxList is full Returns true if this list is full, false otherwise
   * 
   */

  public boolean isFull() {

    if (this.size == this.capacity) {
      return true;
    }
    return false;
  }


  /**
   * Adds a new box into this sorted list. Throws IllegalArgumentException. If newBox is null Throws
   * IllegalStateException if this list is full. takes into consideration 3 situations.
   * 
   * @param newBox is the box to be added
   */

  public void add(Box newBox) {

    if (newBox == null) {
      throw new IllegalArgumentException("box added cannot be null");
    }
    if (isFull()) {

      throw new IllegalStateException("the list is full");
    }

    if (isEmpty()) { // adds new box if no boxes are there as the head
      head = new LinkedBoxNode(newBox);
      this.size++;
      return;


    } else {
      LinkedBoxNode runner = head;
      LinkedBoxNode myBox = new LinkedBoxNode(newBox);
      LinkedBoxNode previous = null;



      while (runner != null) {



        if (runner.getBox().compareTo(newBox) > 0) { // compares box to be added in terms of weight
          previous = runner;
          runner = runner.getNext();
          if (runner == null) { // if newbox is lighter the add after the compared box

            previous.setNext(myBox);
            this.size++;
            return;

          }



        } else {

          if (runner == head) { // if newBox is heavier add before the head

            myBox.setNext(runner);
            head = myBox;
            this.size++;
            return;


          } else {


            myBox.setNext(runner); // otherwise add before compared box and set the pointers
                                   // accordingly
            previous.setNext(myBox);
            this.size++;
            return;

          }

        }

      }
    }

  }

  /**
   * Checks if this list contains a box that matches with (equals) a specific box object Returns
   * true if this list contains findBox, false otherwise
   * 
   * @param findBox is the box to be found within the list
   */



  public boolean contains(Box findBox) {
    LinkedBoxNode runner = head;
    while (runner != null) {

      if (runner.getBox().equals(findBox)) {

        return true;
      }
      runner = runner.getNext();

    }


    return false;
  }

  /**
   * Returns a box stored in this list given its index . Throws IndexOutOfBoundsException if index
   * is out of the range 0..size-1
   * 
   * @param index is the target index needed
   */

  public Box get(int index) {


    if (index > (this.size - 1) || index < 0) {

      throw new IndexOutOfBoundsException("index is out of range");

    }
    LinkedBoxNode runner = head;
    Box myBox = new Box();
    int count = 0; // counter that runs through the indexes in the list
    while (runner != null) {

      if (index == count) {


        myBox = runner.getBox();
      }
      runner = runner.getNext(); // moves to the next box
      count++; // increment the counter symbolizing the index incrementing

    }
    return myBox;
  }

  /**
   * Removes and returns the box stored at index from this LinkedBoxList Throws
   * IndexOutOfBoundsException if index is out of bounds. index should be in the range of [0..
   * size()-1]
   * 
   * @param index is the target index needed
   */


  public Box remove(int index) {

    if (index > (this.size - 1) || index < 0) {

      throw new IndexOutOfBoundsException("index is out of bounds");

    }
    LinkedBoxNode runner = head;
    LinkedBoxNode previous = null;
    Box removedBox = null;

    if (index == 0) { // removes head

      removedBox = get(index);
      head = runner.getNext();
      this.size--;

    } else if (index == (size - 1)) { // removed last box in the list
      while (runner != null) {
        previous = runner;
        runner = runner.getNext();


      }

      removedBox = get(index);
      previous.setNext(null);
      this.size--;


    } else { // removes box at index within the list and set the pointers accordingly

      int count = 0;
      while (runner != null) {

        if (index == count) {
          removedBox = get(index);
          previous.setNext(runner.getNext());
          this.size--;

        } else {
          previous = runner;
          runner = runner.getNext();
          count++;

        }

      }

    }



    return removedBox;

  }

  /**
   * Removes all the boxes from this list
   * 
   */

  public void clear() {

    head = null;
    this.size = 0;

  }


  /**
   * Returns a String representation for this LinkedBoxList
   */
  @Override
  public String toString() {
    StringBuilder result = new StringBuilder(); // creates a StringBuilder object
    String newLine = System.getProperty("line.separator");
    result.append("------------------------------------------------" + newLine);
    if (!isEmpty()) {
      LinkedBoxNode runner = head;
      int index = 0;
      // traverse the list and add a String representation for each box
      while (runner != null) {
        result.insert(0,
            "Box at index " + index + ": " + runner.getBox().getWeight() + " lbs" + newLine);
        runner = runner.getNext();
        index++;
      }
      result.insert(0, "Box List Content:" + newLine);
    }
    result.insert(0, "List size: " + size + " box(es)." + newLine);
    result.insert(0, "Box List is empty: " + isEmpty() + newLine);
    result.insert(0, "------------------------------------------------" + newLine);
    return result.toString();
  }



}
