// Title: (StorageUnitOrganizer, linkedBoxNode class)
// Course: (CS 300, Summer, and 2020)
//
// Author: (Gowham Saravanan)
// Email: (your gsaravanan@wisc.edu email address)
// Lecturer's Name: Mouna Kacem
// Persons: (NONE)
// Online Sources: (NONE)

/**
 * This class represents the linked box nodes for the storage unit organizer
 * 
 */
public class LinkedBoxNode {


  private Box box; // box that represents the data for this Linked node

  private LinkedBoxNode next; // reference to the next Linked Box Node
  // constructors

  /**
   * 
   * creates a new LinkedBoxNode object with a given box and without referring to any next
   * LinkedBoxNode
   * 
   * @param box to be created
   */

  public LinkedBoxNode(Box box) {

    this.box = box;


  }

  /**
   * creates a new LinkedBoxNode object and sets its instance fields box and next to the specified
   * ones
   * 
   * @param box  to be created
   * @param next is in relation to position within the list
   */
  public LinkedBoxNode(Box box, LinkedBoxNode next) {

    this.box = box;
    this.next = next;


  }


  /**
   * getter method for the next node
   * 
   */

  public LinkedBoxNode getNext() {

    return this.next;

  }

  /**
   * setter method for the next node
   * 
   * @param next as the linkedboxlist node
   */

  public void setNext(LinkedBoxNode next) {

    this.next = next;


  }

  /**
   * getter method for the current node and box
   * 
   */

  public Box getBox() {

    return this.box;



  }

  /**
   * setter method for the current node
   * 
   * @param box to be set
   */

  public void setBox(Box box) {

    this.box = box;



  }



}
