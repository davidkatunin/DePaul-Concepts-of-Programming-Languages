// GENERATED

// Complete the following recursive definition of an "allEqual" function
// to check whether all elements in a list of integers are equal.
// EXAMPLES:
// - allEqual (Nil) == true
// - allEqual (List (5)) == true
// - allEqual (List (5, 5, 5)) == true
// - allEqual (List (6, 5, 5, 5)) == false
// - allEqual (List (5, 5, 6, 5)) == false
// - allEqual (List (5, 5, 5, 6)) == false

def allEqual (xs : List[Int]) : Boolean = {
  // TODO: Provide definition here.
  if (xs.isEmpty || xs.size == 1) {
    true;
  } else if (xs.head != xs.tail.head){
    false;
  } else {
    allEqual(xs.tail);
  }
}
