// GENERATED

// Complete the function definition for "delete1" that takes an element "x" and a list "ys", 
// then returns the list where any occurrences of "x" in "ys" have been removed.  
// Your definition of "delete1" MUST be recursive.
// EXAMPLE:
// - delete1 ("the", List ("the","the","was","a","product","of","the","1980s")) == List ("was","a","product","of","1980s")

def delete1 [X] (x:X, ys:List[X]) : List[X] = {
  // TODO: Provide definition here.
  if (ys.isEmpty) {
    ys
  } else if (ys.head == x) {
    delete1(x,ys.tail)
  } else {
    ys.head :: delete1(x,ys.tail)
  }
}
