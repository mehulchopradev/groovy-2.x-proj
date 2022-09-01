import xyz.supercoders.geometry.domain.Square
import xyz.supercoders.geometry.domain.Rectangle
import com.abc.geometry.ShapeStats

def s1 = new Square(side: 6)

/* println "Area is: ${s1.area()}"
println "Perimeter is: ${s1.perimeter()}" */

ShapeStats.compute s1

ShapeStats.compute 'mehul' // ????

def r1 = new Rectangle(length: 8, breadth: 3)
ShapeStats.compute r1