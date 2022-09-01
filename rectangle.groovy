def perimeterRectangle(length, breadth) {
  2 * (length + breadth)
}

def areaRectangle(length, breadth) {
  length * breadth
}

def l1 = 9
def b1 = 4

// built in functions
println "Perimeter is ${perimeterRectangle l1, b1}"
println "Area is ${areaRectangle l1, b1}"
