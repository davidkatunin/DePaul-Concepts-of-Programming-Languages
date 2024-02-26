// GENERATED

// Complete the following function.
// It has one parameter: a list of (references to) RefInt instances.
// Your code must CHANGE the argument it receives in a way that is visible to the caller.
// Note that this is the Scala List type, which is immutable!
// You can assume that the list you receive is not empty.

def refint5 (xs : List[RefInt]) : Unit = {
  // TODO: Provide definition here.
  for (x <- xs) {
    x.set(x.get() * 2)
  }
}
