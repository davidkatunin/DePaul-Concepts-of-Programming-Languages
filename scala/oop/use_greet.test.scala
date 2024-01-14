// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_use_greet extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import use_greet._

  test ("use_greet") {
    Future {
      for (greeting <- List ("Hello", "Bonjour"); name <- List ("Alice", "Bob")) {
        val res1 = useGreet (new Internationalization {
          def greet (name : String) = greeting + " " + name
        }, name)
        assertEquals (res1, greeting + " " + name)
      }
    }
  }
}
