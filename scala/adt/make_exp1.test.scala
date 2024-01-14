// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_make_exp1 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import adt._
  import make_exp1._

  test ("make_exp1") {
    Future {
      val rand = scala.util.Random
      val x = rand.nextInt (100)
      val y = rand.nextInt (100)
      val res = makeExp1 (x, y) match {
        case ExpBinOp (bop1, ExpBinOp (bop2, e1, e2), ExpBinOp (bop3, e3, e4))
            if (bop1 == BinAdd) && (bop2 == BinMul) && (bop3 == BinMul) &&
            (e1 == e2) && (e3 == e4) && (e1 == ExpInt (x)) && (e3 == ExpInt (y))
            => true
        case _ => false
      }
      assertEquals (res, true)
    }
  }
}
