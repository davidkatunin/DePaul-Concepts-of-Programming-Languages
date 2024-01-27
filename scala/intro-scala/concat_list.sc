// GENERATED

// Write a function "concatList" that takes a list of strings and concatenates them with a comma between them.  
// Your function should return the empty string for the empty list.
// Your function should return the string when called with a singleton list (list with one element).
// For longer lists, e.g., concatList ("a", "b", c") == "a,b,c"
// As with all of the exercises in this assignment, your function MUST be recursive and
// MUST NOT use a while loop.

def concatList (xs : List[String]) : String = {
  // TODO: Provide definition here.
  if (xs == Nil) {
    ""
  } else if (xs.length == 1) {
    xs(0)
  } else {
    xs(0) + "," + concatList(xs.patch(0, Nil, 1))
  }
}
