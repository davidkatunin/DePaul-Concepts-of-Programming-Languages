// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_delete3 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import delete3._

  test ("delete3") {
    Future {
      assertEquals (delete3 (1, Nil), Nil)
      assertEquals (delete3 ("the", List ("the","the","was","a","product","of","the","1980s")), List ("was","a","product","of","1980s"))
    }
  }
}
