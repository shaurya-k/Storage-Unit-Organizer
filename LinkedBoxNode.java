//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Storage Unit Organizer)
// Files: (LinkedBoxNode.java)
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
 * This class creates new nodes and has methods related to setting and getting boxes and next
 * 
 * @author Shaurya
 *
 */
public class LinkedBoxNode {
  private Box box; // box that represents the data for this Linked node
  private LinkedBoxNode next; // reference to the next Linked Box Node

  // constructors
  /**
   * creates a new LinkedBoxNode object with a given box and without referring to any next
   * LinkedBoxNode
   * 
   * @param box - type box to assign to this.box
   */
  public LinkedBoxNode(Box box) {
    this.box = box; // assigns box
    // this.next = null;
  }

  /**
   * creates a new LinkedBoxNode object and sets its instance fields box and next to the 
   * specified ones
   * @param box - type box to assign to this.box
   * @param next - type node to assign to this.next
   */
  public LinkedBoxNode(Box box, LinkedBoxNode next) {

    this.box = box; // assigns box
    this.next = next; // assigns next
  }


  // getters and setters methods
  /**
   * this method sets the box
   * @param box - type box to set as this.box
   */
  public void setBox(Box box) {
    this.box = box; // sets the box to this box
  }

  /**
   * this method sets next
   * @param next - type node to set as this.next
   */
  public void setNext(LinkedBoxNode next) {
    this.next = next; // sets next to this next
  }

  /**
   * this method retrieves box
   * @return box 
   */
  public Box getBox() {
    return this.box; // returns the box
  }

  /**
   * this method retrieves next
   * @return next
   */
  public LinkedBoxNode getNext() {
    return this.next; // returns next
  }


}
