// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_concat_list extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import concat_list._

  test ("concat_list") {
    Future {
      assertEquals (concatList (Nil), "")
      assertEquals (concatList (List ("abc")), "abc")
      assertEquals (concatList (List ("abc", "d")), "abc,d")
      assertEquals (concatList (List ("abc", "d", "ef")), "abc,d,ef")
    }
  }
}
