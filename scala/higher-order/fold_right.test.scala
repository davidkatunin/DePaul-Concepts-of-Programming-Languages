// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_fold_right extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import fold_right._

  test ("fold_right") {
    Future {
      def f (n : Int, s : String) : String = s + "[" + n + "]"
      assertEquals (myFoldRight (Nil, "@", f), "@")
      assertEquals (myFoldRight ((1 to 3).toList, "@", f), "@[3][2][1]")
    }
  }
}
