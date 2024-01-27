// GENERATED

// Write a function "sumList" that takes a list of integers and sums them.  
// As with all of the exercises in this assignment, your function MUST be recursive and
// MUST NOT use a while loop.

def sumList (xs : List[Int]) : Int = {
  // TODO: Provide definition here.
  if (xs == Nil) {
    0
  } else if (xs.length == 1) {
    xs(0)
  } else {
    xs(0) + sumList(xs.patch(0, Nil, 1))
  }
}
