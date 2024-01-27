// GENERATED

// Write a recursive function "otpu" ("upto" backwards) that takes two Int parameters
// "start" and "end" and produces a "List[Int]" that counts DOWN from "start" to "end" (inclusive
// at both ends) one at a time. 
//  If "start < end", the empty list must be returned.

def otpu (start : Int, end : Int) : List[Int] = {
  // TODO: Provide definition here.
  if (start < end) {
    val l = List[Int]()
    l
  } else {
    val firstList = List[Int](start)
    if (start >= end){
      val finalList = firstList ::: otpu(start - 1, end)
      finalList
      } else {
        firstList
      }
    }
  }
