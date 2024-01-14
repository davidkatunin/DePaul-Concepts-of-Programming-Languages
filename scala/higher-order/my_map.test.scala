// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_my_map extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import my_map._

  test ("my_map") {
    Future {
      assertEquals (myMap (Nil, (n:Int) => n + 1), Nil)
      assertEquals (myMap ((1 to 5).toList, (n:Int) => n + 1), (2 to 6).toList)
    }
  }
}
