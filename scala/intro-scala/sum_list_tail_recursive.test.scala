// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_sum_list_tail_recursive extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import sum_list_tail_recursive._

  test ("sum_llst_tail_recursive") {
    Future {
      assertEquals (sumListTailRecursive (Nil), 0)
      assertEquals (sumListTailRecursive (List (15)), 15)
      assertEquals (sumListTailRecursive ((0 to 100).toList), 5050)
    }
  }
}
