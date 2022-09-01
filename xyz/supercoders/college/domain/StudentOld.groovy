// google
// google.com
// com.google........
package xyz.supercoders.college.domain

// Every class in java/groovy is represented by an object in the memory
// Object of a class called as Class (java.lang)
// 1 object per class. Class<Student>
class StudentOld {
  // properties of the Student objects (instance) created from this class
  // instance variables
  String name
  Integer roll
  Character gender
  Float marks

  // class variable
  // class area of the memory
  static Integer count = 0

  // default
  // constructors
  /* StudentOld(this) {

  } */ 

  StudentOld(String name=null, Integer roll=null, Character gender=null, Float marks=null) {
    // `this` -> current object
    this.name = name
    this.roll = roll
    this.gender = gender
    this.marks = marks

    StudentOld.count += 1
  }

  // instance methods
  String getDetails() {
    // `this` is a  implicit variable available in the functtion
    // `this` referes to the current active object
    "Name: ${this.name}\nRoll: ${this.roll}\nGender: ${this.gender}\nMarks: ${this.marks}"
  }

  /*
  def getDetails(this) {

  }
  */

  Character getGrade() {
    // this -> s1, s2, s3,...
    switch (this.marks) {
      case 0.0..40.0: 'F'
        break
      case 40.0..<60.0: 'C'
        break
      case 60.0..<70.0: 'B'
        break
      case 70.0..100.0: 'A'
        break
      default: 'I'
    }
  }

  // static method
  static StudentOld createStudent(String name, Integer roll, Character gender, Float marks) {
    // println this // reference to the class Class of Student
    new StudentOld(name, roll, gender, marks)
  }
}
