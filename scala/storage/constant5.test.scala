// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_constant5 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import constant5._

  test ("constant5") {
    Future {
      assertEquals ({
        val r1 : Int = constant5 ()
        val r2 : Int = constant5 ()
        (r1, r2)
      }, (5, 5)
      )
    }
  }
}
