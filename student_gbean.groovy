import xyz.supercoders.college.domain.Student
import xyz.supercoders.college.domain.Professor
import xyz.supercoders.college.domain.CollegeUser

// import com.abc.salary.SalaryCalculator

// final class Student cannot be inherited further
/* class Xyz extends Student {

} */

println Student.count

// def s1 = new Student([name: 'mehul', gender: 'm', roll: 10, marks: 89])
final def s1 = new Student(name: 'mehul', gender: 'm', roll: -10, marks: 89)
def s2 = new Student(gender: 'f', name: 'caroline', roll: 34, marks: 90)

s1.roll = -40
// Internally
// s1.setRoll(-40)

println s1.roll
// Internally
// println s1.getRoll()

s2.roll = 30

// println s1.getDetails()
// Internally
// println Student.getDetails(s1)

// println s2.getDetails()

println Student.count

def s3 = new Student()
println Student.count

def p1 = new Professor(name: 'jane', gender: 'f', subjects: ['Physics', 'Chemistry'], costPerDay: 2000, noOfDays: 21)
// println p1.getDetails()
// Internally
// println Professor.getDetails(p1)

// p1.subjects.add('Maths')

p1 << 'Maths' << 'English'
println p1.subjects

def i = 5

println i
// Internally
// println i.toString()
// println Integer.toString(i)

println s1
// internally
// println s1.toString()
// println Student.toString(s1)

println p1
// internally
// println p1.toString()
// println Professor.toString(p1)


/* s1 = 90 // a final variable cannot have a different values re assigned
println s1 */

// def cu1 = new CollegeUser(name: 'jjj', gender: 'f')
// will not work as cannot create an instance from an abstract class

// println (SalaryCalculator.compute p1)

println p1.compute()
