// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_max_list_tail_recursive extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import max_list_tail_recursive._

  test ("max_list_tail_recursive") {
    Future {
      assertEquals (maxListTailRecursive (List (15)), 15)
      assertEquals (maxListTailRecursive ((0 to 100).toList), 100)
      assertEquals (maxListTailRecursive ((0 to 100).toList.reverse), 100)
      assertEquals (maxListTailRecursive ((0 to 50).toList ::: ((30 to 70).toList.reverse)), 70)
    }
  }
}
