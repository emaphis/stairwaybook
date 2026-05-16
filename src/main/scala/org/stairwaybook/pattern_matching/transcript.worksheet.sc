/*
 * Copyright (C) 2007-2020 Artima, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Automatically generated Scala interpreter transcript from:
 *
 * Programming in Scala (Fifth Edition)
 * by Martin Odersky, Lex Spoon, Bill Venners, and Frank Sommers
 *
 * http://booksites.artima.com/programming_in_scala_5ed
 */

// ** 271
object Traits:

  trait Expr
  case class Var(name: String) extends Expr
  case class Num(number: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String,
     left: Expr, right: Expr) extends Expr

  //defined trait Expr
  //defined class Var
  //defined class Num
  //defined class UnOp
  //defined class BinOp

  def simplifyTop(expr: Expr): Expr =
     expr match
       case UnOp("-", UnOp("-", e))  => e // Double negation
       case BinOp("+", e, Num(0)) => e // Adding zero
       case BinOp("*", e, Num(1)) => e // Multiplying by one
       case _ => expr


  simplifyTop(UnOp("-", UnOp("-", Var("x"))))

// ** 276
def describe(x: Any) =
   x match
     case 5 => "five"
     case true => "truth"
     case "hello" => "hi!"
     case Nil => "the empty list"
     case _ => "something else"


// ** 277
import math.{E, Pi}
import math.{E, Pi}

E match
   case Pi => s"strange math? Pi = $Pi"
   case _ => "OK"
//val res0: String = OK

val pi = math.Pi
//pi: Double = 3.141592653589793

E match
   case pi => s"strange math? Pi = $pi"
//val res1: String = strange math? Pi = 2.718281828459045

E match
   case pi => s"strange math? Pi = $pi"
   case _ => "OK"


E match
   case `pi` => s"strange math? Pi = $pi"
   case _ => "OK"
//res4: String = OK

// ** 280
def tupleDemo(obj: Any) =
   obj match
     case (a, b, c) => s"matched $a$b$c"
     case _ => ""

tupleDemo(("a ", 3, "-tuple")) // matched a 3-tuple


def generalSize(x: Any) =
   x match
     case s: String => s.length
     case m: Map[_, _] => m.size
     case _ => -1

generalSize("abc")  // 3
generalSize(Map(1-> 'a', 2-> 'b')) // 2
generalSize(math.Pi)  //-1


//3: String // ': String' is the type ascription

//Var("x"): Expr // Expr is a supertype of Var
//res2: Expr = Var(x)

3: Long
//res3: Long = 3

def isIntIntMap(x: Any) =
   x match
     case m: Map[Int, Int] => true
     case _ => false

isIntIntMap(Map(1-> 1))         // true
isIntIntMap(Map("abc"-> "abc")) // true

def isStringArray(x: Any) =
  x match
    case a: Array[String] => "yes"
    case _ => "no"

isStringArray(Array("abc"))     // yes
isStringArray(Array(1, 2, 3))   // no


import Traits.*  // Expr hierarchy.

def simplifyAdd(e: Expr) =
   e match
     case BinOp("+", x, y) if x == y =>
       BinOp("*", x, Num(2))
     case _ => e


def simplifyBad(expr: Expr): Expr =
   expr match
     case UnOp(op, e) => UnOp(op, simplifyBad(e))
     case UnOp("-", UnOp("-", e)) => e
     case _ => expr


// 13.5 Sealed classes

object SealedClasses:

  sealed trait Expr
  case class Var(name: String) extends Expr
  case class Num(number: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String,
     left: Expr, right: Expr) extends Expr

  //defined trait Expr
  //defined class Var
  //defined class Num
  //defined class UnOp
  //defined class BinOp

  def describe(e: Expr): String =
     e match
       case Num(_) => "a number"
       case Var(_) => "a variable"
       case Num(_) => "a number"

val myTuple = (123, "abc")
//myTuple: (Int, String) = (123,abc)

val (number, string) = myTuple
//number: Int = 123
//string: String = abc

val exp = new BinOp("*", Num(5), Num(1))
//exp: BinOp = BinOp(*,Num(5.0),Num(1.0))

val BinOp(op, left, right) = exp
//op: String = *
//left: Expr = Num(5.0)
//right: Expr = Num(1.0)

val withDefault: Option[Int] => Int =
   case Some(x) => x
   case None => 0
   case Some(x) => x

val second: List[Int] => Int =
   case x :: y :: _ => y
   case x :: y :: _ => y

val second2: PartialFunction[List[Int],Int] =
   case x :: y :: _ => y
   case x :: y :: _ => y
