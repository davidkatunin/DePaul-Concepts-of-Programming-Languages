// GENERATED

// Complete the following recursive definition of a "flatten" function called "my_flatten" for Scala's builtin List type.  
// You must not use the builtin "flatten" method.
// Your implementation of "flatten" MUST be recursive.
// HINT: use either ":::" or your definition of "append" in the body of the cons-cell case.
// EXAMPLE:
// - myFlatten (List ((1 to 5).toList, (6 to 10).toList, (11 to 15).toList)) == (1 to 15).toList

def myFlatten [A] (xss:List[List[A]]) : List[A] = {
  // TODO: Provide definition here.
  if (xss.isEmpty) {
    Nil
  } else {
    xss.head ::: myFlatten(xss.tail)
  }
}
