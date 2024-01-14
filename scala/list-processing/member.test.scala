// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_member extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import member._

  test ("member") {
    Future {
      assertEquals (member (5, List (4, 6, 8, 5)), true)
      assertEquals (member (3, List (4, 6, 8, 5)), false)
    }
  }
}
