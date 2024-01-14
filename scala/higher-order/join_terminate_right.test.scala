// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_join_terminate_right extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import join_terminate_right._

  test ("join_terminate_right") {
    Future {
      assertEquals (joinTerminateRight (Nil, ";"), "")
      assertEquals (joinTerminateRight (List ("a"), ";"), "a;")
      assertEquals (joinTerminateRight (List ("a","b","c","d"), ";"), "a;b;c;d;")
    }
  }
}
