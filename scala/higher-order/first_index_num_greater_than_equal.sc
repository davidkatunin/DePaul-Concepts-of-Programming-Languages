// GENERATED

// Complete the following recursive definition of a "firstIndexNumGreaterThanEqual" function
// to find the index (position) of the first number greater than or equal to "a" in a list of integers "xs".
// If the list is empty or there is no number greater than or equal to "a", throw a RuntimeException (with no argument).
// The first index should be zero (not one).
// Your implementation of "firstIndexNumGreaterThanEqual" MUST be recursive.
// EXAMPLES:
// - firstIndexNumGreaterThanEqual (5, List (4, 6, 8, 5)) == 1
// HINT: this is a bit easier to write if you use an auxiliary function.

def firstIndexNumGreaterThanEqual (a : Int, xs : List[Int]) : Int = {
  // TODO: Provide definition here.
  if (xs.isEmpty || ((xs.length == 1) && xs.head < a)) {
    throw new RuntimeException()
  } else if (!(xs.head >= a)) {
    1 + firstIndexNumGreaterThanEqual(a, xs.tail)
  } else {
    0
  }
}
