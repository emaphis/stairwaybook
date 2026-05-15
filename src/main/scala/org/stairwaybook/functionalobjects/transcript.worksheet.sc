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

// Used objects Rat0 - Rat 5 for namespacing

object Rat0:

  class Rational(n: Int, d: Int):
    println("Created " + n + "/" + d)

  new Rational(1, 2)

  Rational(1, 2)


object Rat1:

  class Rational(n: Int, d: Int):
    override def toString = s"$n/$d"

  val x = Rational(1, 3)

  val y = Rational(5, 7)

  Rational(5, 0) // 5/0


object Rat2:

  class Rational(n: Int, d: Int):
     require(d != 0)
     val numer: Int = n
     val denom: Int = d
     override def toString = s"$numer/$denom"
     def add(that: Rational): Rational =
       Rational(
         numer * that.denom + that.numer * denom,
         denom * that.denom
       )


object Rat3:

  class Rational(n: Int, d: Int):

   require(d != 0)

   private val g = gcd(n.abs, d.abs)
   val numer = n / g
   val denom = d / g

   def this(n: Int) = this(n, 1)

   def add(that: Rational): Rational =
     Rational(
       numer * that.denom + that.numer * denom,
       denom * that.denom
     )

   override def toString = s"$numer/$denom"

   private def gcd(a: Int, b: Int): Int =
     if b == 0 then a else gcd(b, a % b)


object Rat4:

  class Rational(n: Int, d: Int):

   require(d != 0)

   private val g = gcd(n.abs, d.abs)
   val numer = n / g
   val denom = d / g

   def this(n: Int) = this(n, 1)

   def + (that: Rational): Rational =
     Rational(
       numer * that.denom + that.numer * denom,
       denom * that.denom
     )

   def * (that: Rational): Rational =
     Rational(numer * that.numer, denom * that.denom)

   override def toString = s"$numer/$denom"

   private def gcd(a: Int, b: Int): Int =
     if b == 0 then a else gcd(b, a % b)


object Rat5:

  class Rational(n: Int, d: Int):

    require(d != 0)

     private val g = gcd(n.abs, d.abs)
     val numer = n / g
     val denom = d / g

     def this(n: Int) = this(n, 1)

     def + (that: Rational): Rational =
       Rational(
         numer * that.denom + that.numer * denom,
         denom * that.denom
       )

     def + (i: Int): Rational =
       Rational(numer + i * denom, denom)

     def - (that: Rational): Rational =
       Rational(
         numer * that.denom - that.numer * denom,
         denom * that.denom
       )

     def - (i: Int): Rational =
       Rational(numer - i * denom, denom)

     def * (that: Rational): Rational =
       Rational(numer * that.numer, denom * that.denom)

     def * (i: Int): Rational =
       Rational(numer * i, denom)

     def / (that: Rational): Rational =
       Rational(numer * that.denom, denom * that.numer)

     def / (i: Int): Rational =
       Rational(numer, denom * i)

     override def toString = s"$numer/$denom"

     private def gcd(a: Int, b: Int): Int =
       if b == 0 then a else gcd(b, a % b)
