// GENERATED

// Complete the following recursive definition of an "append" function called "my_append" for Scala's builtin List type. 
// You must not use the builtin ":::" method.
// Your implementation of "my_append" MUST be recursive.
// HINT: use "::" in the body of the cons-cell case.

def myAppend [A] (xs:List[A], ys:List[A]) : List[A] = {
  // TODO: Provide definition here.
  if (xs.isEmpty && ys.isEmpty) {
    Nil
  } else if (xs.isEmpty) {
    ys.head :: myAppend(xs,ys.tail)
  } else {
    xs.head :: myAppend(xs.tail,ys)
  }
}