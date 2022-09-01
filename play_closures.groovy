def abc() {
  // i (abc) -> Integer object
  def i = 4

  // pqr (abc) -> Closure object
  def pqr = {
    println i // a closure can access the enclosing scope variables
    it * 5
  }

  println pqr(3)
}

abc()
// pqr() // will not work


def mno() {
  // k (mno) -> Integer object
  def k = 10

  // p (mno) -> Closure object
  // closure maintains the enclosing environment variables
  // so that even after the closure is returned from here, when it is called in the future; the enclosing environment
  // variables and their values are still accessible
  def p = {a, b -> a + b + k ** 2}
}

r = mno()
println r(5, 4)