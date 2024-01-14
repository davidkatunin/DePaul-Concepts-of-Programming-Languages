// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_delete1 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import delete1._

  test ("delete1") {
    Future {
      assertEquals (delete1 (1, Nil), Nil)
      assertEquals (delete1 ("the", List ("the","the","was","a","product","of","the","1980s")), List ("was","a","product","of","1980s"))
    }
  }
}
