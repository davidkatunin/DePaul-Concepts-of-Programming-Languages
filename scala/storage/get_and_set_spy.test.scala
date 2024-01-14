// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_get_and_set_spy extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import get_and_set_spy._

  test ("get_and_set_spy") {
    Future {
      assertEquals ({
        val (spy, getAndSet1) : (() => Int, Int => (() => Int, Int => Unit)) = getAndSetSpy ()
        val (get1, set1) : (() => Int, Int => Unit) = getAndSet1 (1)
        val (get2, set2) : (() => Int, Int => Unit) = getAndSet1 (2)
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
        val r9 : Int = spy ()
        set1 (30)
        val r10 : Int = spy ()
        (r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
      }, (1, 1, 10, 10, 2, 2, 20, 10, 2, 3)
      )
    }
  }
}
