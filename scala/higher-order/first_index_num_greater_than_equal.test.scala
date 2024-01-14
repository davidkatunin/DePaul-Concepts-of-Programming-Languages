// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_first_index_num_greater_than_equal extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import first_index_num_greater_than_equal._

  test ("first_index_num_greater_than_equal") {
    Future {
      assertEquals (firstIndexNumGreaterThanEqual (5, List (4, 6, 8, 5)), 1)
      assertEquals (firstIndexNumGreaterThanEqual (7, List (4, 6, 8, 5)), 2)
      assertEquals (firstIndexNumGreaterThanEqual (4, List (4, 6, 8, 5)), 0)
    }
  }
}
