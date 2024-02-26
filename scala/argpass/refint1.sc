// GENERATED

// Complete the following higher-order function.
// It has one parameter f: a function that takes an instance of RefInt (see above for the definition of the class RefInt) and returns Unit (i.e., nothing interesting).
// Your code must create ONLY ONE instance of RefInt, then call f three times.
// f will update the integer stored in the instances of RefInt it is given.
// Your code must return a tuple of the three integers provided by f in the order that they came back from calls, i.e., the integer from the first call to f is the first integer in the returned tuple.

def refint1 (f : RefInt => Unit) : (Int, Int, Int) = {
  // TODO: Provide definition here.
  // Example call:
  // val r = new RefInt (0)
  // f (r)
  // val n : Int = r.get ()
  val result = new RefInt(0)
  f(result)
  val one = result.get()
  f(result)
  val two = result.get()
  f(result)
  val three = result.get()
  (one, two, three)
}
