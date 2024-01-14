// GENERATED

// Complete the following recursive definition of a "foldRight" function called "myFoldRight" for Scala's builtin list type.  
// You must not use the builtin "foldRight" method.
// Your implementation of "myFoldRight" MUST be recursive.
// HINT:   myFoldRight (  Nil, e, f) == e
//         myFoldRight (y::ys, e, f) == f (y, myFoldRight (ys, e, f))

def myFoldRight [A,B] (xs:List[A], e:B, f:(A,B)=>B) : B = {
  // TODO: Provide definition here.
  e
}
