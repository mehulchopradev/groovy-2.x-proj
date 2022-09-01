println "Program starts..."

def scanner = new Scanner(System.in)

/* println "Enter a number: "
def n = scanner.nextInt()
println(n % 2 ? 'Odd' : 'Even')

println "Program ends" */

// play_input -> '5' -> scanner.nextInt() -> 5 -> Odd -> program ends

// play_input -> 'mehul' -> scanner.nextInt() -> InputMismatchException object -> play_input -> automatically rethrow
// InputMismatchException object -> JVM -> handles the exception -> prints the exception stack trace

// play_input -> 'mehul' -> scanner.nextInt() -> InputMismatchException object -> play_input -> handles the exception -> prints the exception stack trace
// -> Progam ends

println "Enter a number: "

// exception handling
def n
try {
  n = scanner.nextInt()
} catch (InputMismatchException exception) {
  println "Hey enter only numbers!"
  return
} catch (exception) {
  // "catch all" exception block
  println "Something went wrong. Please try again"
  return
}

println(n % 2 ? 'Odd' : 'Even')
println "Program ends"