package xyz.supercoders.college.domain

class Book {
  String title
  Integer pages
  Double price
  List<Author> authors = []

  String toString() {
    "Title: ${this.title}\nPages: ${this.pages}\nPrice: ${this.price}"
  }
}