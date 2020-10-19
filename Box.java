//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Storage Unit Organizer)
// Files: (Box.java)
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
import java.util.Random;

/**
 * This class creates box and has methods relating to how to initialize new boxes and has getColor
 * getWeight and compareTo
 * 
 * @author Shaurya
 *
 */
public class Box implements Comparable<Box> {
  private static Random randGen = new Random(); // generator of random numbers
  private int color; // color of this box
  private int weight; // weight of this box in pounds between 1 inclusive and 31 exclusive


  /**
   * Creates a new Box and initializes its instance fields color and weight to random values
   */
  public Box() {
    this.color = randGen.nextInt(); // assigns random int
    this.weight = randGen.nextInt(31); // assigns random int between 0 and 30
  }

  /**
   * Creates a new Box and initializes its instance fields color and weight to the specified values
   * Throws IllegalArgumentException if the provided weight value is out of the range of [1..30]
   * @param color - int that holds color
   * @param weight = int that holds weight
   */
  public Box(int color, int weight) {

    int tempWeight = weight;
    if ((tempWeight < 1) || (tempWeight > 30)) { // checks the range
      throw new IllegalArgumentException("Weight is out of range [1,30]");
    }
    this.color = color; // assigns color
    this.weight = weight; // assigns weight

  }

  /**
   * equals method defined in Object class
   * @param other - takes a different object to check
   */
  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Box)) { // if object is not an instance of box
      return false;

    }
    Box a = (Box) other; // cast box to match box requirements
    if (a.getColor() == (this.getColor()) && a.getWeight() == (this.getWeight())) { // condition
      return true;
    }


    return false;
  }

  /**
   * compareTo method defined in Comparable<Box> interface
   * @param otherBox - type box to compare to current box
   */
  @Override
  public int compareTo(Box otherBox) {
    int difference = this.getWeight() - otherBox.getWeight(); // subtracts the weights and finds the
    // difference
    return difference;
  }

  /**
   * Getter for the instance field color of this box
   * @return color
   */
  public int getColor() {
    return this.color; // returns the color
  }

  /**
   * Getter for the instance field weight of this box
   * @return weight
   */
  public int getWeight() {
    return this.weight; // returns the weight
  }
}
