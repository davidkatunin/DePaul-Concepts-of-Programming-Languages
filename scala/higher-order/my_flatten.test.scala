// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_my_flatten extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import my_flatten._

  test ("my_flatten") {
    Future {
      assertEquals (myFlatten (Nil), Nil)
      assertEquals (myFlatten (List ((1 to 5).toList)), (1 to 5).toList)
      assertEquals (myFlatten (List ((1 to 5).toList, (6 to 10).toList)), (1 to 10).toList)
      assertEquals (myFlatten (List ((1 to 5).toList, (6 to 10).toList, (11 to 15).toList)), (1 to 15).toList)
    }
  }
}
