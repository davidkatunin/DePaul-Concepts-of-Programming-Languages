// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_fold_left extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import fold_left._

  test ("fold_left") {
    Future {
      def f (s : String, n : Int) : String = s + "[" + n + "]"
      assertEquals (myFoldLeft (Nil, "@", f), "@")
      assertEquals (myFoldLeft ((1 to 3).toList, "@", f), "@[1][2][3]")
    }
  }
}
