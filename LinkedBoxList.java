//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Storage Unit Organizer)
// Files: (LinkedBoxList.java)
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
 * This class creates a LinkedBoxList and has methods relating to the list
 * 
 * @author Shaurya
 *
 */
public class LinkedBoxList {
  private LinkedBoxNode head; // head of this LinkedBoxList (refers to the element stored at index
                              // 0 within this list)
  private int size; // number of boxes already stored in this list
  private int capacity; // capacity of this LinkedBoxList maximum number of box elements that this
                        // LinkedBoxList can store


  /**
   * Creates an empty LinkedBoxList with a given initial capacity
   * 
   * @param capacity - int that will set the capacity
   */
  public LinkedBoxList(int capacity) {

    for (int i = 0; i < capacity; i++) {
      new LinkedBoxNode(null);
    }

    this.capacity = capacity;
  }

  /**
   * Returns the size of this list
   * @return size
   */
  public int size() {

    return size; // returns the size

  }

  /**
   * Return the capacity of this list
   * @return capacity
   */
  public int getCapacity() {
    return capacity; // returns capacity

  }

  /**
   * Expands the capacity of this LinkedBoxList with the specified number a of additional elements 
   * @param a - int to add to current capacity
   */

  public void expandCapacity(int a) {

    int temporary = a; // assign temporary to a
    capacity = capacity + temporary; // adds temporary to capacity

  }

  /**
   * Checks whether this LinkedBoxList is empty 
   * @return true if this LinkedBoxList is empty, false otherwise
   */

  public boolean isEmpty() {
    if (size == 0) { // condition
      return true;
    }
    return false;
  }

  /**
   * Checks whether this LinkedBoxList is full 
   * @return true if this list is full, false otherwise
   */

  public boolean isFull() {
    if (size == capacity) { // condition
      return true;
    }

    return false;

  }

  /**
   *  Adds a new box into this sorted list. Throws IllegalArgumentException if newBox is null.
   *  Throws IllegalStateException if this list is full
   * @param newBox - type box to add to list
   * @throws IllegalArgumentException - if new box is null
   * @throws IllegalStateException - if the list is full
   */

  public void add(Box newBox) throws IllegalArgumentException, IllegalStateException {
    LinkedBoxNode firstTemp;
    LinkedBoxNode secondTemp;
    if ((newBox == null)) { // condition
      throw new IllegalArgumentException("newBox is null");
    }
    if (this.isFull()) { // condition
      throw new IllegalStateException("LinkedBoxList is full");
    }
    if (this.isEmpty()) { // condition
      head = new LinkedBoxNode(newBox, null); // creates new LinkedBoxNode
      size++; // increments
      return; // break
    }


    if (head.getBox().compareTo(newBox) < 0) { // condition
      LinkedBoxNode tempNode = head; // assigns new node with head
      head = new LinkedBoxNode(newBox); // sets head with new Node
      head.setNext(tempNode); // sets next with previous head node
      size++; // increment size
      return; // break
    } else {
      firstTemp = head; // assigns with head
      while (firstTemp.getNext() != null && firstTemp.getNext().getBox().compareTo(newBox) >= 0) {
        firstTemp = firstTemp.getNext(); // increments through the list
      }
      secondTemp = firstTemp.getNext(); // assigns with next node
      firstTemp.setNext(new LinkedBoxNode(newBox, secondTemp)); // sets newbox and next node
      size++; // increment
      return; // break
    }


  }



  /**
   * Checks if this list contains a box that matches with (equals) a specific box object
   * Returns true if this list contains findBox, false otherwise
   * @param findBox - box to compare to list 
   * @return true if box is found in list, false if otherwise
   */

  public boolean contains(Box findBox) {
    LinkedBoxNode temp = head; // assigns with head
    while (!(temp.getBox().equals(findBox))) { // condition

      if (temp.getBox().equals(findBox)) { // condition
        return true; // break
      } else {
        temp = temp.getNext(); // takes the next node
      }
    }
    return false; // break
  }

  /**
   * Returns a box stored in this list given its index. Throws IndexOutOfBoundsException if index 
   * is out of the range 0..size-1
   * @return the desired box
   * @param index - value of desired index
   * @throws IndexOutOfBoundsException - if index not with the list size
   */

  public Box get(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index should be in range of [0 , size - 1]");
    }
    LinkedBoxNode temp = head;
    if (index == 0 && (head != null)) {
      return head.getBox();
    }
    while (index > 0) {
      temp = temp.getNext();
      index--;
    }
    return temp.getBox();
  }



  /**
   * Removes a returns the box stored at index from this LinkedBoxList Throws 
   * IndexOutOfBoundsException if index is out of bounds. index should be in the range of 
   * [0.. size()-1]
  
   * @param index - value of desired index
   * @return the removed box
   * @throws IndexOutOfBoundsException - if index not within the list size
   */

  public Box remove(int index) throws IndexOutOfBoundsException {

    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index should be in range of [0 , size() -1]");
    }
    if (size == 1) {
      Box temp = head.getBox();
      head = null;
      size--;
      return temp;
    }
    if (index == 0) {
      Box temp = head.getBox();
      LinkedBoxNode ref = head.getNext();
      head = ref;
      size--;
      return temp;
    } else {
      LinkedBoxNode ref = head;
      for (int i = 0; i < index - 1; i++) {
        ref = ref.getNext();
      }
      LinkedBoxNode next = ref.getNext().getNext();
      Box temp = ref.getNext().getBox();
      ref.setNext(next);
      size--;
      return temp;
    }

  }

  /**
   * Removes all the boxes from this list
   */
  public void clear() {

    head = null; // makes head null

    size = 0; // resets size

  }


  /**
   * Returns a String representation of the state and content of this LinkedBoxList
   * An example of source code for this method is provided you in the next paragraph
   */

  // @Override
  // public String toString() {

  // }


  /**
   * Returns a String representation for this LinkedBoxList
   * @return string representation
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

