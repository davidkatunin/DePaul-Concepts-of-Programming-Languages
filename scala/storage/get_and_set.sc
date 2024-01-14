// GENERATED

// Complete the following definition, so that "getAndSet" is a (stateless) function
// that when invoked with integer n returns a pair of functions (that share state) that allow
// reading and writing a var that is initialized with integer n.  The first function in the pair
// should be the reader.  The second function in the pair should be the writer.  For example, the
// following expression should return 10: { val (get, set) = getAndSet (5); set (10); get () }
// Multiple calls to "getAndSet" should yield independent pairs, i.e., the first pair returned
// should not share any state with the second pair returned.

val getAndSet : Int => (() => Int, Int => Unit) = {
  // TODO: Complete the definition.
  null
}
