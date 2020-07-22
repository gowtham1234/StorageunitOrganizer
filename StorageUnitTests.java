// Title: (StorageUnitOrganizer, Test class)
// Course: (CS 300, Summer, and 2020)
//
// Author: (Gowham Saravanan)
// Email: (your gsaravanan@wisc.edu email address)
// Lecturer's Name: Mouna Kacem
// Persons: (NONE)
// Online Sources: (NONE)


/**
 * This class represents the test methods for the storage unit organizer
 * 
 */

public class StorageUnitTests {

  /**
   * Checks whether the behavior of equals method is correct
   * 
   */
  public static boolean testBoxEquals() {
    Box A = new Box(1, 20);
    Box B = new Box(1, 20);
    if (A.equals(B)) {
      // should return true in this case

      return true;
    }
    return false;


  }

  /**
   * 
   * Checks whether the behavior of compareTo method is correctly implemented
   */

  public static boolean testBoxCompareTo() {

    Box A = new Box(1, 20);
    Box B = new Box(1, 25);

    if (A.compareTo(B) <= 0) {
      // should return true here

      return true;
    }
    return false;

  }

  /**
   * 
   * Checks whether remove method defined in the LinkedBoxList works correctly
   */
  public static boolean testLinkedBoxListRemove() {
    LinkedBoxList linkedList = new LinkedBoxList(10);

    linkedList.add(new Box(1, 24));
    linkedList.add(new Box(1, 6));
    linkedList.add(new Box(1, 5));
    linkedList.add(new Box(1, 6));
    if (linkedList.get(3) != null) {
      System.out.println(linkedList.size()); // previous size
      linkedList.remove(3);
      System.out.println(linkedList.size()); // new size should be one less

      return true;

    }


    return false;
  }


  /**
   * 
   * Checks whether isEmpty() method defined in the LinkedBoxList works correctly
   */
  public static boolean testisEmpty() {
    LinkedBoxList linkedList = new LinkedBoxList(10);
    if (linkedList.isEmpty() == true) {
      // should print out true as there as no elements
      return true;
    }
    return false;
  }


  /**
   * 
   * Checks whether addBox() method defined in the LinkedBoxList works correctly
   */

  public static boolean testaddBox() {
    LinkedBoxList linkedList = new LinkedBoxList(3);

    linkedList.add(new Box(1, 24));
    linkedList.add(new Box(1, 6));
    if (linkedList.size() != linkedList.getCapacity()) {
      System.out.println("previous size: " + linkedList.size());

      // should pass the test and add the box
      linkedList.add(new Box(1, 20));
      System.out.println("Added new box. New size: " + linkedList.size() + linkedList.toString());
      // should be added to index 1 in this case
      return true;
    }

    System.out.println("Not able to add box as list is full");
    return false;



  }


  /**
   * This main method starts the application
   * 
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // System.out.println(testBoxEquals());
    // System.out.println(testBoxCompareTo());
    // System.out.println(testLinkedBoxListRemove());
    // System.out.println( testisEmpty());
    //System.out.println(testaddBox());
    
    
    
  }

}
