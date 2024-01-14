// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_factorial extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import factorial._

  test ("factorial") {
    Future {
      assertEquals (factorial (1),   1)
      assertEquals (factorial (2),   2)
      assertEquals (factorial (3),   6)
      assertEquals (factorial (4),  24)
      assertEquals (factorial (5), 120)
    }
  }
}
