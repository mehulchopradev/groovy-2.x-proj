package xyz.supercoders.geometry.domain

import com.abc.geometry.Shape

class Rectangle extends Shape {
  Float length
  Float breadth

  Double areaRect() {
    this.length * this.breadth
  }

  // method overriding
  Double area() {
    this.areaRect()
  }

  Double perimeter() {
    2 * (this.length + this.breadth)
  }
}