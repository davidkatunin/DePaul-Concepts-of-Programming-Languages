// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_counter0 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import counter0._

  test ("counter0") {
    Future {
      assertEquals ({
        val r1 : Int = counter0 ()
        val r2 : Int = counter0 ()
        val r3 : Int = counter0 ()
        (r1, r2, r3)
      }, (0, 1, 2)
      )
    }
  }
}
