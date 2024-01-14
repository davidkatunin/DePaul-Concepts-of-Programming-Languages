// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_constant extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import constant._

  test ("constant") {
    Future {
      assertEquals ({
        val k1 : () => Int = constant (1)
        val k2 : () => Int = constant (2)
        val r1 : Int = k1 ()
        val r2 : Int = k1 ()
        val r3 : Int = k2 ()
        val r4 : Int = k2 ()
        val r5 : Int = k2 ()
        val r6 : Int = k1 ()
        (r1, r2, r3, r4, r5, r6)
      }, (1, 1, 2, 2, 2, 1)
      )
    }
  }
}
