// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_refint1 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import refint1._

  test ("refint1") {
    Future {
      val rand = scala.util.Random
      val x1 = rand.nextInt (100)
      val x2 = rand.nextInt (100)
      val x3 = rand.nextInt (100)
      var r1 : RefInt = null
      var state = 1
      val res = refint1 {
        case r =>
          if (r1 eq null) {
            r1 = r
          } else {
            if (!(r1 eq r)) {
              throw new RuntimeException ("Only one instance of RefInt is allowed")
            }
          }
          state match {
            case 1 => r1 = r; r.set (x1); state = state + 1
            case 2 => r.set (x2); state = state + 1
            case 3 => r.set (x3); state = state + 1
            case _ => throw new RuntimeException ("Called too many times")
          }
      }
      assertEquals (res, (x1, x2, x3))
    }
  }
}
