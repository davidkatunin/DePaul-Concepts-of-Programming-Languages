// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_first_num_greater_than_equal extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import first_num_greater_than_equal._

  test ("first_num_greater_than_equal") {
    Future {
      assertEquals (firstNumGreaterThanEqual (5, List (4, 6, 8, 5)), 6)
      assertEquals (firstNumGreaterThanEqual (7, List (4, 6, 8, 5)), 8)
      assertEquals (firstNumGreaterThanEqual (4, List (4, 6, 8, 5)), 4)
    }
  }
}
