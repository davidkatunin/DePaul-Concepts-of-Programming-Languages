// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_count_exp_int extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import adt._
  import count_exp_int._

  test ("count_exp_int") {
    Future {
      assertEquals (countExpInt (example01), 2)
      assertEquals (countExpInt (example02), 4)
      assertEquals (countExpInt (example03), 5)
    }
  }
}
