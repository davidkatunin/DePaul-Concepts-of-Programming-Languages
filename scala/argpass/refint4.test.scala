// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_refint4 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import refint4._

  test ("refint4") {
    Future {
      val rand = scala.util.Random
      val x1 = rand.nextInt (100)
      val r1 : RefInt = new RefInt (x1)

      assertEquals (refint4 (r1, {
        case r2 =>
          if (r1 eq r2) {
            throw new RuntimeException ("Must use a copy of r, not r itself")
          }
      }), true)
      
      assertEquals (refint4 (r1, {
        case r2 =>
          if (r1 eq r2) {
            throw new RuntimeException ("Must use a copy of r, not r itself")
          }
          r2.set (r2.get () + 1)
      }), false)
    }
  }
}
