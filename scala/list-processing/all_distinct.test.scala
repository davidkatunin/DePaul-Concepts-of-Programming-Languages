// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_all_distinct extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import all_distinct._

  test ("all_distinct") {
    Future {
      assertEquals (allDistinct (Nil), true)
      assertEquals (allDistinct (List (1,2,3,4,5)), true)
      assertEquals (allDistinct (List (1,2,3,4,5,1)), false)
      assertEquals (allDistinct (List (1,2,3,2,4,5)), false)
    }
  }
}
