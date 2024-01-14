// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_get_and_set extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import get_and_set._

  test ("get_and_set") {
    Future {
      assertEquals ({
        val (get1, set1) : (() => Int, Int => Unit) = getAndSet (1)
        val (get2, set2) : (() => Int, Int => Unit) = getAndSet (2)
        val r1 : Int = get1 ()
        val r2 : Int = get1 ()
        set1 (10)
        val r3 : Int = get1 ()
        val r4 : Int = get1 ()
        val r5 : Int = get2 ()
        val r6 : Int = get2 ()
        set2 (20)
        val r7 : Int = get2 ()
        val r8 : Int = get1 ()
        (r1, r2, r3, r4, r5, r6, r7, r8)
      }, (1, 1, 10, 10, 2, 2, 20, 10)
      )
    }
  }
}
