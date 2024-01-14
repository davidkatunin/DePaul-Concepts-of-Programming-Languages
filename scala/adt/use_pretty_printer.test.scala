// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_use_pretty_printer extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import adt._
  import use_pretty_printer._

  test ("use_pretty_printer") {
    Future {
      val rand = scala.util.Random
      val x = rand.nextInt (100)
      val y = rand.nextInt (100)
      assertEquals (usePrettyPrinter (x, y), s"((${x}+${y})*(${x}+${y}))")
    }
  }
}
