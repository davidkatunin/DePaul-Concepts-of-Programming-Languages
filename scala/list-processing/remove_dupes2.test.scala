// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_remove_dupes2 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import remove_dupes2._

  val test1 = List ("The", "rain", "in", "Spain", "falls", "mainly", "on", "the", "plain.")
  val test2 = List (1,1,2,3,3,3,4,4,5,6,7,7,8,9,2,2,2,9)

  test ("remove_dupes2") {
    Future {
      assertEquals (removeDupes2 (Nil), Nil)
      assertEquals (removeDupes2 (test2), List ((2,1),(1,2),(3,3),(2,4),(1,5),(1,6),(2,7),(1,8),(1,9),(3,2),(1,9)))
    }
  }
}
