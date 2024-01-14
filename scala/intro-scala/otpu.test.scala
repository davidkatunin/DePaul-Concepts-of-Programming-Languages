// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_otpu extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import otpu._

  test ("otpu") {
    Future {
      assertEquals (otpu (20, 10), (10 to 20).toList.reverse)
      assertEquals (otpu (15, 10), (10 to 15).toList.reverse)
      assertEquals (otpu (15,  7), ( 7 to 15).toList.reverse)
    }
  }
}
