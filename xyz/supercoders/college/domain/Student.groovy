package xyz.supercoders.college.domain

// Student IS-A (CollegeUser) (Person) (HumanBeing)
// Student - child class / subclass
// CollegeUser - Parent class / superclass
// groovy bean!
final class Student extends CollegeUser {
  Integer roll
  Float marks

  static Integer count = 0

  Student() {
    Student.count += 1
  }

  // every groovy bean gets a parameterized constructor that takes a Map as an input, by default
  /* Student(Map map) {
    this() // calling the no argument constructor of the same class
    this.name = map['name']
    this.roll = map['roll']
    this.gender = map['gender']
    this.marks = map['marks']
  } */

  // setter methods for all the instance variables are available in groovy bean
  /* def setRoll(roll) {
    this.roll = roll
  } */

  // getter methods for all the instance variables are available in groovy bean
  /* def getRoll() {
    this.roll
  } */

  // encapsulation - ondemand
  def setRoll(Integer roll) {
    if (roll > 0) {
      this.roll = roll
    }
  }

  // method overriding
  String getDetails() {
    "${super.getDetails()}\nRoll: ${this.roll}"
  }
}