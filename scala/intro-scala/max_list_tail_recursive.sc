// GENERATED

// Given the definition of the function "maxListTailRecursive" below, complete the
// definition of the function "maxListTailRecursiveAux" so that "maxListTailRecursive" 
// also finds the maximum of a list of integers. 
// You must not alter the definition of "maxListTailRecursive".  
// Your definition for "maxListTailRecursiveAux" must be recursive and not use while loops.

def maxListTailRecursiveAux (accumulator : Int, xs : List[Int]) : Int = {
  // TODO: Provide definition here.
  -1
}

def maxListTailRecursive (xs : List[Int]) : Int = {
  xs match {
    case Nil   => throw new NoSuchElementException () 
    case y::ys => maxListTailRecursiveAux (y, ys)
  }
}
