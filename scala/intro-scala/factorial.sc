// GENERATED

// Complete the following definition of the factorial function.

def factorial (n : Int) : Int = {
  // TODO: Provide definition here.
  if (n <= 1){
    1
  } else {
    n * factorial(n-1)
  }
}
