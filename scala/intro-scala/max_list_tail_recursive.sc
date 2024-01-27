// GENERATED

// Given the definition of the function "maxListTailRecursive" below, complete the
// definition of the function "maxListTailRecursiveAux" so that "maxListTailRecursive" 
// also finds the maximum of a list of integers. 
// You must not alter the definition of "maxListTailRecursive".  
// Your definition for "maxListTailRecursiveAux" must be recursive and not use while loops.

def maxListTailRecursiveAux (accumulator : Int, xs : List[Int]) : Int = {
  // TODO: Provide definition here.
  if (xs.isEmpty){
    accumulator
  } else if (xs.size == 1){
    xs(0)
  } else {
    val largestSoFar = maxListTailRecursiveAux(xs.head,xs.tail)
    if (largestSoFar < accumulator) {
      accumulator
    } else {
      largestSoFar
    }
  }
}

def maxListTailRecursive (xs : List[Int]) : Int = {
  xs match {
    case Nil   => throw new NoSuchElementException () 
    case y::ys => maxListTailRecursiveAux (y, ys)
  }
}
