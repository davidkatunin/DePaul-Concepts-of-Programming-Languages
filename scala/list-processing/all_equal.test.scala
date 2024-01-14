// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_all_equal extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import all_equal._

  test ("all_equal") {
    Future {
      assertEquals (allEqual (Nil), true)
      assertEquals (allEqual (List (5)), true)
      assertEquals (allEqual (List (5, 5, 5)), true)
      assertEquals (allEqual (List (6, 5, 5, 5)), false)
      assertEquals (allEqual (List (5, 5, 6, 5)), false)
      assertEquals (allEqual (List (5, 5, 5, 6)), false)
    }
  }
}
