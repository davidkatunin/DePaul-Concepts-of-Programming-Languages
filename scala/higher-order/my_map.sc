// GENERATED

// Complete the following recursive definition of a "map" function called "myMap" for Scala's builtin List type.  
// You must not use the builtin "map" method.
// Your implementation of "myMap" MUST be recursive.

def myMap [A,B] (xs:List[A], f:A=>B) : List[B] = {
  // TODO: Provide definition here.
  if (xs.isEmpty) {
    Nil
  } else {
    f(xs.head) :: myMap(xs.tail, f)
  } 
}
