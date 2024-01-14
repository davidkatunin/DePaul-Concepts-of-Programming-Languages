// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_delete2 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import delete2._

  test ("delete2") {
    Future {
      assertEquals (delete2 (1, Nil), Nil)
      assertEquals (delete2 ("the", List ("the","the","was","a","product","of","the","1980s")), List ("was","a","product","of","1980s"))
    }
  }
}
