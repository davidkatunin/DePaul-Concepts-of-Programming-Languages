// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_join_terminate_left extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import join_terminate_left._

  test ("join_terminate_left") {
    Future {
      assertEquals (joinTerminateLeft (Nil, ";"), "")
      assertEquals (joinTerminateLeft (List ("a"), ";"), "a;")
      assertEquals (joinTerminateLeft (List ("a","b","c","d"), ";"), "a;b;c;d;")
    }
  }
}
