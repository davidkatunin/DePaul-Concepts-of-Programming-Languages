// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_refint5 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import refint5._

  test ("refint5") {
    Future {
      val rand = scala.util.Random
      val xs : List[Int] = (1 to 5).toList.map (x => rand.nextInt (100))
      val ys : List[RefInt] = xs.map (x => new RefInt (x))
      refint5 (ys)
      var changed = false
      for ((x, r) <- xs.zip (ys)) {
        if (x != r.get ()) {
          changed = true
        }
      }
      if (!changed) {
        throw new RuntimeException ("xs is unchanged!")
      }
    }
  }
}
