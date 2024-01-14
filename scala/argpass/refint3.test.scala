// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_refint3 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import refint3._

  test ("refint3") {
    Future {
      val rand = scala.util.Random
      val x1 = rand.nextInt (100)
      val r1 : RefInt = new RefInt (x1)
      val r2 : RefInt = refint3 (r1)
      assertEquals (r1.get (), x1 + 1)
      assertEquals (r2.get (), x1 * 2)
    }
  }
}
