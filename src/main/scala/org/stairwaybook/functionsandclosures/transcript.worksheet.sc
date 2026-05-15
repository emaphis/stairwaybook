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


val someNumbers = List(-11, -10, -5, 0, 5, 10)
//someNumbers: List[Int] = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach((x: Int) => println(x))
//-11 -10 -5 0 5 10

someNumbers.filter((x: Int) => x > 0)
//res0: List[Int] = List(5, 10)

someNumbers.filter((x) => x > 0)
//res1: List[Int] = List(5, 10)

someNumbers.filter(x => x > 0)
//res2: List[Int] = List(5, 10)

someNumbers.filter(_ > 0)
//res3: List[Int] = List(5, 10)

someNumbers.filter(x => x > 0)
//res4: List[Int] = List(5, 10)

//val f = _ + _
// error: missing parameter type for expanded function ((<x$1: error>, x$2) => x$1.$plus(x$2))

val f = (_: Int) + (_: Int)
//f: (Int, Int) => Int = $$Lambda$785/208824749@1c23e369

f(5, 10)
//res5: Int = 15

//(x: Int) => x + more
//Not found: more

def makeIncreaser(more: Int) = (x: Int) => x + more
//makeIncreaser: (more: Int)Int => Int

val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)

def echo(args: String*) =
  for arg <- args do println(arg)

echo("one")

echo("hello", "world!")

val seq = Seq("What's", "up", "doc?")
//seq: Seq[String] = List(What's, up, doc?)

//echo(seq)
// ERROR

echo(seq*)

def boom(x: Int): Int =
  if x == 0 then throw new Exception("boom!")
  else boom(x - 1) + 1

def bang(x: Int): Int =
  if x == 0 then throw new Exception("bang!")
  else bang(x - 1)
