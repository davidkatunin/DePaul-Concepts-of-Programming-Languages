// GENERATED

// Complete the following recursive definition of a "foldLeft" function called "myFoldLeft" for Scala's builtin list type.  
// You must not use the builtin "foldLeft" method.
// Your implementation of "foldLeft" MUST be recursive.
// HINT:   myFoldLeft (  Nil, e, f) == e
//         myFoldLeft (y::ys, e, f) == myFoldLeft (ys, f (e, y), f)

def myFoldLeft [A,B] (xs:List[A], e:B, f:(B,A)=>B) : B = {
  // TODO: Provide definition here.
  if (xs.isEmpty) {
    e
  } else {
    myFoldLeft(xs.tail, f(e, xs.head), f)
  }
}
