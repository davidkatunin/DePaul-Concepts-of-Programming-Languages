// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_fibonacci extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import fibonacci._

  test ("fibonacci") {
    Future {
      assertEquals (fibonacci ( 0),  0)
      assertEquals (fibonacci ( 1),  1)
      assertEquals (fibonacci ( 2),  1)
      assertEquals (fibonacci ( 3),  2)
      assertEquals (fibonacci ( 4),  3)
      assertEquals (fibonacci ( 5),  5)
      assertEquals (fibonacci ( 6),  8)
      assertEquals (fibonacci ( 7), 13)
      assertEquals (fibonacci ( 8), 21)
      assertEquals (fibonacci ( 9), 34)
      assertEquals (fibonacci (10), 55)
      assertEquals (fibonacci (11), 89)
    }
  }
}
