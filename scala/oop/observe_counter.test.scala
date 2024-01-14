// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_observe_counter extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import observe_counter._

  test ("observe_counter") {
    Future {
      val rand = scala.util.Random
      var total = rand.nextInt (100)
      val res = observeCounter {
        case c:Counter =>
          for (i <- 1 to total) {
            if (rand.nextBoolean ()) {
              c.increment ()
            } else {
              c.decrement ()
            }
          }
      }
      assertEquals (res, total)
    }
  }
}
