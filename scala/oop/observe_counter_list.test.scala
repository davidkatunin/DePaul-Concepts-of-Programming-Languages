// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_observe_counter_list extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import observe_counter_list._

  test ("observe_counter_list") {
    Future {
      val rand = scala.util.Random
      var totals : List[Int] = (1 to 3).toList.map (_ => rand.nextInt (100))
      val res : List[Int] = observeCounterList {
        case cs:List[Counter] =>
          if (cs.length != 3) {
            throw new RuntimeException ("Length of list must be exactly 3")
          }
          for ((total, c) <- totals.zip (cs)) {
            for (i <- 1 to total) {
              if (rand.nextBoolean ()) {
                c.increment ()
              } else {
                c.decrement ()
              }
            }
          }
      }
      assertEquals (res, totals)
    }
  }
}
