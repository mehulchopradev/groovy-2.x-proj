def getDetails(name, gender, roll, marks) {
  "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
}

def getGrade(marks) {
  switch (marks) {
    case 0..40: 'F'
      break
    case 40..<60: 'C'
      break
    case 60..<70: 'B'
      break
    case 70..100: 'A'
      break
    default: 'I'
  }
}

def n1 = 'mehul'
def g1 = 'm'
def r1 = 10
def m1 = 90

println getDetails(n1, g1, r1, m1)
println "Grade score is ${getGrade m1}"