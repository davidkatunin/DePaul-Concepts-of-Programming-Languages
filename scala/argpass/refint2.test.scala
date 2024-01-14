// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_refint2 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import refint2._

  test ("refint2") {
    Future {
      val rand = scala.util.Random
      val x1 = rand.nextInt (100)
      val x2 = rand.nextInt (100)
      val x3 = rand.nextInt (100)
      var r1 : RefInt = null
      var r2 : RefInt = null
      var r3 : RefInt = null
      var state = 1
      val res = refint2 {
        case r =>
          for (s <- List (r1, r2, r3))
            if (!(r eq null) && (r eq s)) {
              throw new RuntimeException ("Must pass a new instance of RefInt for each call")
            }
          state match {
            case 1 => r1 = r; r.set (-2); state = state + 1
            case 2 => r2 = r; r.set (-2); state = state + 1
            case 3 => r3 = r; r1.set (x1); r2.set (x2); r3.set (x3); state = state + 1
            case _ => throw new RuntimeException ("Called too many times")
          }
      }
      assertEquals (res, (x1, x2, x3))
    }
  }
}
