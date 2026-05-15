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


trait Philosophical:
  def philosophize = "I consume memory, therefore I am!"


class Frog extends Philosophical:
  override def toString = "green"

class Rational(n: Int, d: Int) extends Ordered[Rational]:
   def compare(that: Rational) =
     (this.numer * that.denom) - (that.numer * this.denom)

   private val g = gcd(n.abs, d.abs)
   val numer = n / g
   val denom = d / g
   private def gcd(a: Int, b: Int): Int =
     if (b == 0) a else gcd(b, a % b)
   override def toString = s"$numer/$denom"

abstract class IntQueue:
   def get(): Int
   def put(x: Int): Unit


import scala.collection.mutable.ArrayBuffer
       
 class BasicIntQueue extends IntQueue:
   private val buf = ArrayBuffer.empty[Int]
   def get() = buf.remove(0)
   def put(x: Int) = buf += x


trait Doubling extends IntQueue:
  abstract override def put(x: Int) = super.put(2 * x)

trait Incrementing extends IntQueue:
  abstract override def put(x: Int) = super.put(x + 1)


trait Filtering extends IntQueue:
   abstract override def put(x: Int) =
     if x >= 0 then super.put(x)


val frog = new Frog
frog.philosophize
//res0: String = I consume memory, therefore I am!
