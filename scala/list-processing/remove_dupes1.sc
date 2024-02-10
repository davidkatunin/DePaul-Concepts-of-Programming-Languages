// GENERATED

// Complete the function definition for "removeDupes1" below.
// It takes a list as argument, then returns the same list with consecutive duplicate elements compacted to a single element.
// Duplicate elements that are separated by at least one distinct element should be left alone.
// EXAMPLE:
// - removeDupes1 (List (1,1,2,3,3,3,4,4,5,6,7,7,8,9,2,2,2,9)) == List (1,2,3,4,5,6,7,8,9,2,9)


def removeDupes1 [X] (xs:List[X]) : List[X] = {
  // TODO: Provide definition here.
  if (xs.size <= 1) {
    xs
  } else if (xs.head == xs.tail.head) {
    removeDupes1(xs.tail)
  } else {
    xs.head :: removeDupes1(xs.tail)
  }
}