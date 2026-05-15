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


val a = 'A'
//a: Char = A

val d = '\u0041'
//d: Char = A

val f = '\u0044'
//f: Char = D

//val B\u0041\u0044 = 1
//Int = 1

val backslash = '\\'
//backslash: Char = \

val hello = "hello"
//hello: String = hello

val escapes = "\\\"\'"
//escapes: String = \"'

s"The answer is ${6 * 7}."
//res0: String = The answer is 42.

f"${math.Pi}%.5f"
//res1: String = 3.14159

val pi = "Pi"
//pi: String = Pi

f"$pi is approximately ${math.Pi}%.8f."
//res2: String = Pi is approximately 3.14159265.

val sumMore = 1.+(2)
//sumMore: Int = 3

val s = "Hello, world!"
//s: String = Hello, world!

s indexOf 'o'   // Scala invokes s.indexOf('o')
//res3: Int = 4

-2.0   // Scala invokes (2.0).unary_-
//res4: Double = -2.0

(2.0).unary_-
//res5: Double = -2.0

val s2 = "Hello, world!"
//s2: String = Hello, world!

s.toLowerCase
//res6: String = hello, world!

import scala.language.postfixOps
//import scala.language.postfixOps

s toLowerCase
//res7: String = hello, world!

def salt() = { println("salt"); false }
//salt: ()Boolean

def pepper() = { println("pepper"); true }
//pepper: ()Boolean

pepper() && salt()
//pepper salt res8: Boolean = false

salt() && pepper()
//salt res9: Boolean = false

salt() & pepper()
//salt pepper res10: Boolean = false
