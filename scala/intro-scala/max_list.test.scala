// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_max_list extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import max_list._

  test ("max_list") {
    Future {
      assertEquals (maxList (List (15)), 15)
      assertEquals (maxList ((0 to 100).toList), 100)
      assertEquals (maxList ((0 to 100).toList.reverse), 100)
      assertEquals (maxList ((0 to 50).toList ::: ((30 to 70).toList.reverse)), 70)
    }
  }
}
