// GENERATED

// Complete the following recursive definition of a "filter" function called "myFilter" for Scala's builtin List type.  
// You must not use the builtin "filter" method.
// Your implementation of "myFilter" MUST be recursive.

def myFilter [A] (xs:List[A], f:A=>Boolean) : List[A] = {
  // TODO: Provide definition here.
  if (xs.isEmpty) {
    Nil
  } else if (f(xs.head)){
    xs.head :: myFilter(xs.tail, f) 
  } else {
    myFilter(xs.tail,f)
  }
}
