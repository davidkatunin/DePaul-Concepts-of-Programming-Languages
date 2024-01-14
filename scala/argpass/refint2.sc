// GENERATED

// Complete the following higher-order function.
// It has one parameter f: a function that takes an instance of RefInt (see above for the definition of the class RefInt) and returns Unit (i.e., nothing interesting).
// Your code must create EXACTLY THREE instances of RefInt, then call f three times.
// f will update the integer stored in the instances of RefInt it is given.
// However, f will not do this update immediately.
// It will only do it after the third call to f: at that point it updates all three instances of RefInt that it has received as arguments so far.
// Your code must return a tuple of the three integers provided by f in the order that they came back from calls, i.e., the integer from the first call to f is the first integer in the returned tuple.

def refint2 (f : RefInt => Unit) : (Int, Int, Int) = {
  // TODO: Provide definition here.
  (-1, -1, -1)
}
