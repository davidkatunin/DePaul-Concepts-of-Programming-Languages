// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_my_append extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import my_append._

  test ("my_append") {
    Future {
      assertEquals (myAppend (            Nil,              Nil), Nil)
      assertEquals (myAppend (            Nil, (6 to 10).toList), (6 to 10).toList)
      assertEquals (myAppend ((1 to 5).toList,              Nil), (1 to 5).toList)
      assertEquals (myAppend ((1 to 5).toList, (6 to 10).toList), (1 to 10).toList)
    }
  }
}
