//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Storage Unit Organizer)
// Files: (StorageUnitTests.java)
// Course: (CS300, Spring, and 2019)
//
// Author: (Shaurya Kethireddy)
// Email: (skethireddy@wisc.edu)
// Lecturer's Name: (Gary Dahl)
//
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: (identify each person and describe their help in detail)
// Online Sources: (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
/**
 * This class tests certain algorithms and checks if they are doing their intended purpose
 * 
 * @author Shaurya
 *
 */

public class StorageUnitTests {
  /**
   * Checks whether the behavior of equals method is correct
   * 
   * @return false if algorithm doesn't work
   */
  public static boolean testBoxEquals() {
    Box one = new Box(24, 12); // creates new box
    Box two = new Box(24, 28); // creates new box
    Box three = new Box(24, 12); // creates new box
    Box four = new Box(31, 9); // creates new box
    if (one.equals(three)) { // compares equal boxes
      if (!(one.equals(two))) { // compares unequal boxes
        if (!(one.equals(four))) { // compares unequal boxes

          System.out.println("Passed testBoxEquals test"); // pass
          return true;
        }
      }
    }
    System.out.println("Failed testBoxEquals test"); // fail
    return false;

  }

  /**
   * Checks whether the behavior of compareTo method is correctly implemented
   * 
   * @return false if test failed
   */
  public static boolean testBoxCompareTo() {
    Box one = new Box(); // creates new box
    Box two = new Box(); // creates new box
    int result = one.compareTo(two); // compares one to two
    if (one.getWeight() - two.getWeight() == result) { // checking if function returns correct
      System.out.println("Passed testBoxCompareTo test");
      return true;
    }

    System.out.println("Failed testBoxCompareTo test");
    return false;

  }

  /**
   * Checks whether remove method defined in your LinkedBoxList works correctly
   * @return false if test failed
   */
  public static boolean testLinkedBoxListRemove() {
    Box a = new Box(1, 1); // new box
    Box b = new Box(2, 2); // new box
    Box c = new Box(3, 3); // new box
    Box d = new Box(4, 4); // new box

    LinkedBoxList list = new LinkedBoxList(4); // new list
    list.add(a); // add to list
    list.add(b); // add to list
    list.add(c); // add to list
    list.add(d); // add to list

    if (list.size() == 4) { // checks size before remove
      list.remove(2); // runs remove
      if (list.size() == 3) { // checks size after remove
        if (!list.contains(c)) { // checks if removed box is in the list
          System.out.println("Passed testLinkedBoxListRemove test");
          return true; // success
        }

      }
    }
    System.out.println("Failed testLinkedBoxListRemove test");
    return false; // fail
  }

  /**
   * Checks whether expandCapacity method in LinkedBoxList class works correctly
   * @return false if test failed
   */
  public static boolean testExpandCapacity() {
    LinkedBoxList list = new LinkedBoxList(4); // creates new list with capacity 4
    list.expandCapacity(6); // expands capacity by 6
    if (list.getCapacity() == 10) { // checks if expandCapacity adds correctly
      System.out.println("Passed testExpandCapacity test");
      return true; // success
    }
    System.out.println("Failed testExpandCapacity test");
    return false; // fail
  }

  /**
   * Checks whether isFull method in LinkedBoxList class works correctly
   * @return false if test failed
   */
  public static boolean testIsFull() {
    Box a = new Box(); // creates new box
    Box b = new Box(); // creates new box
    Box c = new Box(); // creates new box
    Box d = new Box(); // creates new box

    LinkedBoxList list = new LinkedBoxList(4); // creates new list with capacity 4
    list.add(a); // add box to list
    list.add(b); // add box to list
    list.add(c); // add box to list
    list.add(d); // add box to list
    if (list.size() == 4) { // checks if size = capacity
      if (list.isFull() == true) { // checks if method recognizes list is full
        System.out.println("Passed testIsFull test");
        return true; // success
      }
    }
    System.out.println("Failed testIsFull test");
    return false; // fail
  }

  /**
   * Checks whether isEmpty method from LinkedBoxList class works correctly
   * @return false if test fails
   */
  public static boolean testIsEmpty() {
    Box a = new Box(1, 1); // creates new box
    Box b = new Box(2, 2); // creates new box
    Box c = new Box(3, 3); // creates new box
    Box d = new Box(4, 4); // creates new box

    LinkedBoxList list = new LinkedBoxList(4); // creates new list with capacity 4
    list.add(a); // add box to list
    list.add(b); // add box to list
    list.add(c); // add box to list
    list.add(d); // add box to list
    for (int i = 0; i < list.getCapacity(); i++) { // removes every element
      list.remove(0);
    }
    if (list.isEmpty()) { // checks if algorithm recognizes that list is empty
      System.out.println("Passed testIsEmpty test");
      return true; // success

    }
    System.out.println("Failed testIsEmpty test");
    return false; // fail

  }

  /**
   * checks whether clear method in LinkedBoxList class works correctly
   * @return false if test failed
   */
  public static boolean testClear() {
    Box a = new Box(1, 1); // creates new box
    Box b = new Box(2, 2); // creates new box
    Box c = new Box(3, 3); // creates new box
    Box d = new Box(4, 4); // creates new box

    LinkedBoxList list = new LinkedBoxList(4); // creates new list with capacity 4
    list.add(a); // add box to list
    list.add(b); // add box to list
    list.add(c); // add box to list
    list.add(d); // add box to list
    list.clear();

    if (list.size() == 0) { // checks if size gets changed to 0 when clear is called
      System.out.println("Passed testClear test");
      return true; // success
    }
    System.out.println("Failed testClear test");
    return false; // fail

  }

  /**
   * main method which runs all the test methods
   * @param args
   */
  public static void main(String[] args) {
    testBoxEquals(); // runs test
    testBoxCompareTo(); // runs test
    testLinkedBoxListRemove(); // runs test
    testExpandCapacity(); // runs test
    testIsFull(); // runs test
    testIsEmpty(); // runs test
    testClear(); // runs test
  }
}
