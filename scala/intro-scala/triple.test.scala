// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_triple extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import triple._

  test ("triple") {
    Future {
      assert (t1 != null)
      assertEquals (t1._1, 7)
      assertEquals (t1._2, "hello")
      assertEquals (t1._3, false)
    }
  }
}
