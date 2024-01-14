// GENERATED

import scala.concurrent.Future
import scala.concurrent.duration.Duration

class Tests_make_exp2 extends munit.FunSuite {
  implicit val ec : scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  override val munitTimeout = Duration (1, "s")
  import adt._
  import make_exp2._

  test ("make_exp2") {
    Future {
      val rand = scala.util.Random
      val x = rand.nextInt (100)
      val y = rand.nextInt (100)
      val res = makeExp2 (x, y) match {
        case ExpBinOp (bop1,
          ExpBinOp (bop2,
            ExpBinOp (bop3, v1, v2),
            ExpBinOp (bop4, v3, v4)
          ),
          ExpBinOp (BinAdd,
            ExpBinOp (BinAdd,
              ExpBinOp (BinMul, v5, v6),
              ExpBinOp (BinMul, ExpInt (2), ExpBinOp (BinMul, v7, v8))
            ),
            ExpBinOp (BinMul, v9, v10)
          )
        ) if (bop1 == BinEq) && (bop2 == BinMul) && (bop3 == BinAdd) && (bop4 == BinAdd) &&
            (v1 == ExpInt (x)) && (v2 == ExpInt (y)) && (v3 == ExpInt (x)) &&
            (v4 == ExpInt (y)) && (v5 == ExpInt (x)) && (v6 == ExpInt (x)) &&
            (v7 == ExpInt (x)) && (v8 == ExpInt (y)) && (v9 == ExpInt (y)) && (v10 == ExpInt (y)) &&
            true => true
        case _ => false
      }
      assertEquals (res, true)
    }
  }
}
