marks = [9, 10, 9, 8, 4, 5, 8, 10, 2, 7, 3]

// higher order function
/* def forEach(elements, actionClosure) {
  for (def ele in elements) {
    // dynamic part comes here
    actionClosure(ele)
  }
} */

// print all the odd marks that were scored
println 'All odd marks'
/* for (def mark in marks) {
  if (mark % 2) {
    println mark
  }
} */

// Closures
// they are very much like functions
// they are treated as regular values that can be passed around

/* def printOdd = {mark ->
  if (mark % 2) {
    println mark
  }
} */

/* def printOdd = {
  // `it` is an implict parameter
  // iteration element
  if (it % 2) {
    println it
  }
} */
/* forEach(marks) {
  // `it` is an implict parameter
  // iteration element
  if (it % 2) {
    println it
  }
} */

marks.each {
  if (it % 2) {
    println it
  }
}

// print all the even marks more than 4 that were scored
println 'All even marks more than 4'
/* for (def mark in marks) {
  if (mark % 2 == 0 && mark > 4) {
    println mark
  }
} */

/* def printEvensMoreThan4 = {mark ->
  if (mark % 2 == 0 && mark > 4) {
    println mark
  }
} */
/* def printEvensMoreThan4 = {
  if (it % 2 == 0 && it > 4) {
    println it
  }
} */
/* forEach(marks) {
  if (it % 2 == 0 && it > 4) {
    println it
  }
} */

marks.each {
  if (it % 2 == 0 && it > 4) {
    println it
  }
}