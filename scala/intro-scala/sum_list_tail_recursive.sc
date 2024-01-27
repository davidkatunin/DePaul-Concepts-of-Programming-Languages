// GENERATED

// Given the definition of the function "sumListTailRecursiveAux" below, complete the
// definition of the function "sumListTailRecursive" so that it also sums a list of integers.  
// You must not alter the definition of "sumListTailRecursiveAux".  
// Your definition for "sumListTailRecursive" must call "sumListTailRecursiveAux" directly, 
// and must not call "sumList".

def sumListTailRecursiveAux (accumulator : Int, xs : List[Int]) : Int = {
  xs match {
    case Nil => accumulator
    case y::ys => sumListTailRecursiveAux (accumulator + y, ys)
  }
}

def sumListTailRecursive (xs : List[Int]) : Int = {
  // TODO: Provide definition here.
  if (xs.size <= 0) {
    0
  } else if (xs.size == 1) {
    xs(0)
  } else {
    xs(0) + sumListTailRecursiveAux(xs.head, xs.tail)
  }
}
