def n = 50

// odds nos till 50
// i = 1
// i % 2 != 0
  // print i
// i = i + 1

// while loop
/* def i = 1

while (i <= n) {
  if (i % 2) {
    println i
  }

  i += 1
} */

// traditional for
/* for (def i = 1; i <= n; i++) {
  if (i % 2) {
    println i
  }
} */

// groovy for loop
/*
  for (<<some-variable>> in <<range of elements>>) {
    //
    //
  }
*/

/* for (def v in 1..50) {
  if (v % 2) {
    println v
  }
} */

def range = (1..50).step(2)
for (def v in range) {
  println v
}