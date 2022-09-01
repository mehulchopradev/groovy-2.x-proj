package xyz.supercoders.college.domain

abstract class CollegeUser { // extends Object (implicitly)
  String name
  Character gender

  String getDetails() {
    // `this` -> Student, Professor, sub class object of CollegeUser
    "Name: ${this.name}\nGender: ${this.gender}"
  }

  String toString() {
    // this =-> Student, Professor
    "Name: ${this.name}\nGender: ${this.gender}"
  }
}