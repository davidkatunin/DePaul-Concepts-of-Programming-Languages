// GENERATED

object adt {
  // UnOp represents unary operators
  sealed trait UnOp
  case object UnNeg extends UnOp // unary negation
  case object UnNot extends UnOp // logical not

  // BinOp represents binary operators
  sealed trait BinOp
  case object BinAdd extends BinOp // addition
  case object BinSub extends BinOp // subtraction
  case object BinMul extends BinOp // multiplication
  case object BinDiv extends BinOp // division
  case object BinEq  extends BinOp // equality

  // Exp represents simple arithmetic and/or relational expressions
  // For example,
  // - ExpBool (true) represents the expression consisting of the boolean literal true.
  // - ExpInt (5) represents the expression consisting of the integer literal 5.
  // - ExpBinOp (BinAdd, ExpInt (5), ExpInt (6)) represents the expression "(5 + 6)"
  sealed trait Exp
  case class ExpBool (b : Boolean)                      extends Exp
  case class ExpInt (n : Int)                           extends Exp
  case class ExpUnOp (uop : UnOp, e : Exp)              extends Exp
  case class ExpBinOp (bop : BinOp, e1 : Exp, e2 : Exp) extends Exp

  // Val represents the result of evaluation an expression: either a boolean or an integer
  sealed trait Val
  case class ValBool (b : Boolean)                     extends Val
  case class ValInt (n : Int)                          extends Val

  // example01 represents "1 + 2"
  val example01 : Exp = {
    ExpBinOp (BinAdd, ExpInt (1), ExpInt (2))
  }

  // example02 represents "(1 + 2) * (3 - 1)"
  val example02 : Exp = {
    ExpBinOp (BinMul,
      ExpBinOp (BinAdd, ExpInt (1), ExpInt (2)),
      ExpBinOp (BinSub, ExpInt (3), ExpInt (1))
    )
  }

  // example03 represents "((1 + 2) * (3 - 1)) == 7"
  val example03 : Exp = {
    ExpBinOp (BinEq,
      ExpBinOp (BinMul,
        ExpBinOp (BinAdd, ExpInt (1), ExpInt (2)),
        ExpBinOp (BinSub, ExpInt (3), ExpInt (1))
      ),
      ExpInt (7)
    )
  }

  // The next four functions provide "pretty printing" for Exp, Val, and unary/binary operators.
  // A pretty printer prints a nice string for a data structure.

  def ppUn (uop : UnOp) : String = { 
    uop match {
      case UnNeg => "-"
      case UnNot => "!"
    }
  }

  def ppBin (bop : BinOp) : String = { 
    bop match {
      case BinAdd => "+"
      case BinSub => "-"
      case BinMul => "*"
      case BinDiv => "/"
      case BinEq  => "=="
    }
  }

  def ppExp (e : Exp) : String = { 
    e match {
      case ExpBool (b)            => b.toString
      case ExpInt (n : Int)       => n.toString
      case ExpUnOp (uop, e)       => "(" + ppUn (uop) + ppExp (e) + ")"
      case ExpBinOp (bop, e1, e2) => "(" + ppExp (e1) + ppBin (bop) + ppExp (e2) + ")"
    }
  }

  def ppVal (v : Val) : String = { 
    v match {
      case ValBool (b)      => b.toString
      case ValInt (n : Int) => n.toString
    }
  }

  // The next three functions are used to evaluate expressions represented as Exp.
  // The result will be a Val.  
  // An EvalException will be thrown if an error occurs.  
  // The errors arise from typing, i.e., an operator such as BinAdd is not supported for booleans.

  class EvalException (s : String) extends Exception

  def evalUn (uop : UnOp, v : Val) : Val = { 
    (uop, v) match {
      case (UnNeg,  ValInt (n)) => ValInt (-n)
      case (UnNot, ValBool (b)) => ValBool (!b)
      case _                    => throw new EvalException (s"cannot apply ${ppUn (uop)} to ${ppVal (v)}")
    }
  }

  def evalBin (bop : BinOp, v1 : Val, v2 : Val) : Val = { 
    (bop, v1, v2) match {
      case (BinAdd,  ValInt (n1),  ValInt (n2)) => ValInt (n1 + n2)
      case (BinSub,  ValInt (n1),  ValInt (n2)) => ValInt (n1 - n2)
      case (BinMul,  ValInt (n1),  ValInt (n2)) => ValInt (n1 * n2)
      case (BinDiv,  ValInt (n1),  ValInt (n2)) => ValInt (n1 / n2)
      case ( BinEq,  ValInt (n1),  ValInt (n2)) => ValBool (if (n1 == n2) true else false)
      case ( BinEq, ValBool (b1), ValBool (b2)) => ValBool (if (b1 == b2) true else false)
      case _                                    => throw new EvalException (s"cannot apply ${ppBin (bop)} to ${ppVal (v1)} and ${ppVal (v2)}")
    }
  }

  // Notice that evalExp works by evaluating its subexpressions (things of type Exp) e, e1, e2 to Val first, 
  // and then calls either evalUn or evalBin with the resulting values.

  def evalExp (e : Exp) : Val = { 
    e match {
      case ExpBool (b)            => ValBool (b)
      case ExpInt (n)             => ValInt (n)
      case ExpUnOp (uop, e)       => evalUn (uop, evalExp (e))
      case ExpBinOp (bop, e1, e2) => evalBin (bop, evalExp (e1), evalExp (e2))
    }
  }
}

