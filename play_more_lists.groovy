marks = [9, 10, 9, 8, 4, 5, 8, 10, 2, 7, 3]

// get a new list consisting of odd marks more than 3 from the marks list
// filtering

/* lr = []
for (def mark in marks) {
  if (mark % 2 && mark > 3) {
    lr.add(mark)
  }
}
println lr */

def oddsMoreThan3 = marks.findAll { it % 2 && it > 3 }
println oddsMoreThan3

// get a new list consisting of evens less than 6 from the marks list
def evensLessthan6 = marks.findAll { it % 2 == 0 && it < 6 }
println evensLessthan6

// get a new list consisting of all marks from marks list but each one of them deducted by 1
// mapping
def deductedMarks = marks.collect { it - 1 }
println deductedMarks

// I want to know whether any student has scored more than 8 marks
def r = marks.any { it > 8 }
println r

// I want to know whether all students have score more than 1 mark
def r1 = marks.every { it > 1 }
println r1

// sort the list in the descending order
/* def l = marks.sort(false) {m1, m2 ->
  // ascending order
  // negative - m2 < m1
  // zero - m1 == m2
  // positive - m2 > m1
  m2.compareTo(m1)
} */

// spaceship operator
def l = marks.sort(false) {m1, m2 -> m2 <=> m1}
println l