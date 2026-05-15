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


def greet() = println("hi")
//greet: ()Unit

val iAmUnit = greet() == ()
//iAmUnit: Boolean = true

for i <- 1 to 4 do
  println(s"Iteration $i")

for i <- 1 until 4 do
  println(s"Iteration $i")

val a = 1
//a: Int = 1

val a2 = 2
//a2: Int = 2

println(a2)
//2
