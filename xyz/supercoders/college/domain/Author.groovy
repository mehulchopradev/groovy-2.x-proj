package xyz.supercoders.college.domain

class Author {
  String name
  Integer ratings
  Character gender
  Contact contact

  String toString() {
    "Name: ${this.name}\nRatings: ${this.ratings}\nGender: ${this.gender}"
  }
}