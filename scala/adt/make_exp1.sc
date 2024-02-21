// GENERATED

// Complete the following function.
// It has two integer parameters x and y.
// It should return an Exp that represents "(x * x) + (y * y)".
// That is, calling makeExp1 (5, 6) should return an Exp that represents "(5 * 5) + (6 * 6)".
// HINT: your code should have 4 occurrences of ExpInt in it.

import adt._

def makeExp1 (x : Int, y : Int) : Exp = {
  // TODO: Provide definition here.
  ExpBinOp( BinAdd,
    ExpBinOp(BinMul, ExpInt(x), ExpInt(x)),
    ExpBinOp(BinMul, ExpInt(y), ExpInt(y))
  )
}
