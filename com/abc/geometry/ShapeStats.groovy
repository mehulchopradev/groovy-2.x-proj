package com.abc.geometry

class ShapeStats {
  static void compute(shapeObj) {
    if (shapeObj instanceof Shape) {
      println "*********** Shape statistics computation *************"
      println "Area is: ${shapeObj.area()}"
      println "Perimeter is: ${shapeObj.perimeter()}"
    } else {
      println "Please pass in something that is a shape!"
    }
  }
}