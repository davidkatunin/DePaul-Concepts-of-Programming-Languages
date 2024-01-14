// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_new_french extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import new_french._

  test ("new_french") {
    Future {
      val i18n : Internationalization = newFrench ()
      for (name <- List ("Alice", "Bob")) {
        assertEquals (i18n.greet (name), "Bonjour" + " " + name)
      }
    }
  }
}
