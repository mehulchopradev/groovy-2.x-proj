package xyz.supercoders.geometry.domain

import com.abc.geometry.Shape

class Square extends Shape {
  Double side

  // method overriding
  Double area() {
    this.side ** 2
  }

  Double perimeter() {
    4 * this.side
  }
}