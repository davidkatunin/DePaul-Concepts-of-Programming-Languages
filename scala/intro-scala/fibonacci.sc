// GENERATED

// Complete the following definition of the Fibonacci function.

def fibonacci (n : Int) : Int = {
  // TODO: Provide definition here.
  if (n <= 1) {
    n
  } else {
    fibonacci(n-1) + fibonacci(n-2)
  }
}
