// def s1 = new Student() // 9001 RAM
// Internally
// 1. new -> 9001 space is reserved for the object
// 2. Student() -> Student(9001)

/* s1.name = 'mehul'
s1.roll = 10
s1.gender = 'm'
s1.marks = 67 */

import xyz.supercoders.college.domain.StudentOld as St

println St.count // 0

def s1 = new St('mehul', 10, 'm' as Character, 67)
// internally
// 1. new  -> 9001 space is reserved
// 2. Student('mehul', 10, 'm', 67) -> Student(9001, 'mehul', 10, 'm', 67)

// ???

def s2 = new St() // 9006 RAM
s2.name = 'caroline'
s2.roll = 12
s2.gender = 'f'
s2.marks = 95

def s3 = St.createStudent('caroline', 13, 'f' as Character, 90)

println s1.getDetails()
// Internally
// println Student.getDetails(s1)

println s2.getDetails()
// Internally
// println Student.getDetails(s2)

println s3.getDetails()

println St.count // 2

/* println s1.name
println s1.roll

println s2.name
println s2.roll
*/

println s1.getGrade()
// Internally
// Student.getGrade(s1)

println s2.getGrade()