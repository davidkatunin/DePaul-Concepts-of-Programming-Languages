// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_sum_list extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import sum_list._

  test ("sum_list") {
    Future {
      assertEquals (sumList (Nil), 0)
      assertEquals (sumList (List (15)), 15)
      assertEquals (sumList ((0 to 100).toList), 5050)
    }
  }
}
