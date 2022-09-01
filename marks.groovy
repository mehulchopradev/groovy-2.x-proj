// getGrade (marks)
/*
  >= 70 - A
  >= 60 - B
  >= 40 - C
  < 40 - F
  > 100 or < 0 - I
*/

def getGrade(marks) {
  // if - else if - else if - ..... else
  /* if (marks > 100 || marks < 0) {
    'I'
  } else if (marks >= 70) {
    'A'
  } else if (marks >= 60) {
    'B'
  } else if (marks >= 40) {
    'C'
  } else {
    'F'
  } */

  // Range data
  // def r1 = 5..25
  // def t = 50
  // def r2 = 8..<t

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

def scanner = new Scanner(System.in)
println "Enter marks: "
def marks = scanner.nextInt()

println "Grade scored is ${getGrade marks}"