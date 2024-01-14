// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_remove_dupes1 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import remove_dupes1._

  val test1 = List ("The", "rain", "in", "Spain", "falls", "mainly", "on", "the", "plain.")
  val test2 = List (1,1,2,3,3,3,4,4,5,6,7,7,8,9,2,2,2,9)

  test ("remove_dupes1") {
    Future {
      assertEquals (removeDupes1 (Nil), Nil)
      assertEquals (removeDupes1 (test2), List (1,2,3,4,5,6,7,8,9,2,9))
    }
  }
}
