// GENERATED

// Complete the definition of the following function that computes the length of
// each String in a list, and returns the original Strings paired with their length.
// For example:
//
//   stringLengths (List ("the", "rain")) == List (("the", 3), ("rain", 4))
//
// You must not use recursion directly in the function.  
// You can use the "map" method of the List class.

def stringLengths (xs:List[String]) : List[(String, Int)] = {
  // TODO: Provide definition here.
  if (xs.isEmpty) {
    xs
  }
  xs.map(x => (x, x.length))
}
