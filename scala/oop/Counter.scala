// GENERATED

// Instances of Counter have a integer field that can be incremented, decremented, or read.

class Counter {
  private var n = 0
  def increment () = { n = n + 1 }
  def decrement () = { n = n - 1 }
  def get () : Int = n
}
