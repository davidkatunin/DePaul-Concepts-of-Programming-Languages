// GENERATED

// Complete the following function.
// It has two integer parameters x and y.
// It should return an Exp that represents "((x + y) * (x + y)) == (((x * x) + (2 * (x * y))) + (y * y))".

import adt._

def makeExp2 (x : Int, y : Int) : Exp = {
  // TODO: Provide definition here.
  ExpBinOp( BinEq,
    ExpBinOp( BinMul,
      ExpBinOp( BinAdd, ExpInt(x), ExpInt(y)),
      ExpBinOp( BinAdd, ExpInt(x), ExpInt(y))
    ),
    ExpBinOp(BinAdd,
      ExpBinOp(BinAdd,
        ExpBinOp(BinMul, ExpInt(x), ExpInt(x)),
        ExpBinOp(BinMul, ExpInt(2), ExpBinOp(BinMul, ExpInt(x), ExpInt(y)))
      ),
      ExpBinOp(BinMul, ExpInt(y), ExpInt(y))
    )
  )
}
