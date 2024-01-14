// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_split_at extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import split_at._

  test ("split_at") {
    Future {
      assertEquals (splitAt (7, (1 to 15).toList), ((1 to 7).toList, (8 to 15).toList))
      assertEquals (splitAt (1, (1 to 15).toList), ((1 to 1).toList, (2 to 15).toList))
      assertEquals (splitAt (0, (1 to 15).toList), (List (), (1 to 15).toList))
      assertEquals (splitAt (-1, (1 to 15).toList), (List (), (1 to 15).toList))
      assertEquals (splitAt (15, (1 to 15).toList), ((1 to 15).toList, List ()))
      assertEquals (splitAt (16, (1 to 15).toList), ((1 to 15).toList, List ()))
    }
  }
}
