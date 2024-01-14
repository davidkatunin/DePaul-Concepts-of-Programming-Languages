// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_my_filter extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import my_filter._

  test ("my_filter") {
    Future {
      assertEquals (myFilter (Nil, (n:Int) => false), Nil)
      assertEquals (myFilter (Nil, (n:Int) => true), Nil)
      assertEquals (myFilter ((1 to 5).toList, (n:Int) => false), Nil)
      assertEquals (myFilter ((1 to 5).toList, (n:Int) => true), (1 to 5).toList)
      assertEquals (myFilter ((1 to 5).toList, (n:Int) => n % 2 == 1), List (1,3,5))
    }
  }
}
