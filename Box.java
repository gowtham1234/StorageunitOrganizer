// Title: (StorageUnitOrganizer, Box class)
// Course: (CS 300, Summer, and 2020)
//
// Author: (Gowham Saravanan)
// Email: (your gsaravanan@wisc.edu email address)
// Lecturer's Name: Mouna Kacem
// Persons: (NONE)
// Online Sources: (NONE)



import java.util.Random;

/**
 * This class represents the box class for the storage unit organizer and implements the comparable
 * interface
 * 
 */

public class Box implements Comparable<Box> {

  private static Random randGen = new Random(); // generator of random numbers
  private int color; // color of this box
  private int weight; // weight of this box in lbs between 1 inclusive and 31 exclusive


  /**
   * Creates a new Box and initializes its instance fields color and weight to random values
   * 
   */
  public Box() {
    this.color = randGen.nextInt();
    this.weight = randGen.nextInt(30) + 1;

  }

  /**
   * Creates a new Box and initializes its instance fields color and weight to the specified values
   * Throws IllegalArgumentException if the provided weight value is out of the range of [1..30]
   * 
   * @param color  is the color code representing each color
   * @param weight is the weight of the box
   */



  public Box(int color, int weight) {
    this.color = color;
    this.weight = weight;
    if (weight < 1 || weight > 30) {
      throw new IllegalArgumentException("weight value is out of range");


    }
  }

  /**
   * Getter for the instance field color of this box
   * 
   */


  public int getColor() {

    return color;
  }


  /**
   * 
   * Getter for the instance field weight of this box
   */



  public int getWeight() {

    return weight;
  }


  /**
   * 
   * compares boxes, by overriding the compareTO method.
   * 
   * @param box is the box to be compared with
   */

  @Override
  public int compareTo(Box box) {
    // TODO Auto-generated method stub


    return Integer.compare(this.weight, box.weight);

  }


  /**
   * 
   * check for equality, by overriding the equalTO method and returns true or false
   * 
   * @param box is the box to be equated to for the comparison state
   */

  @Override
  public boolean equals(Object box) {

    if (box instanceof Box) {
      if (this.compareTo((Box) box) == 0 && this.color == (((Box) box).getColor())) {

        return true;
      }
    }


    return false;
  }



}
