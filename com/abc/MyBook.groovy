package com.abc

class MyBook {
  String name
  Integer pages
  Double pr

  String toString() {
    "Title: ${this.name}\nPages: ${this.pages}\nPrice: ${this.pr}"
  }
}