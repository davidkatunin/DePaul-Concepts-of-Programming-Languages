// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_swap extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import swap._

  test ("swap") {
    Future {
      assertEquals (swap (("hello", "world")), ("world", "hello"))
      assertEquals (swap (("hello",   "xxx")), (  "xxx", "hello"))
    }
  }
}
