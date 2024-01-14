// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_string_lengths extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import string_lengths._

  val test1 = List ("The", "rain", "in", "Spain", "falls", "mainly", "on", "the", "plain.")
  val test2 = List (1,1,2,3,3,3,4,4,5,6,7,7,8,9,2,2,2,9)

  test ("string_lengths") {
    Future {
      assertEquals (stringLengths (Nil), Nil)
      assertEquals (stringLengths (test1), test1.zip (List (3, 4, 2, 5, 5, 6, 2, 3, 6)))
    }
  }
}
