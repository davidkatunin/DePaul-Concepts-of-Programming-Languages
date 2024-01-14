// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_new_english extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import new_english._

  test ("new_english") {
    Future {
      val i18n : Internationalization = newEnglish ()
      for (name <- List ("Alice", "Bob")) {
        assertEquals (i18n.greet (name), "Hello" + " " + name)
      }
    }
  }
}
