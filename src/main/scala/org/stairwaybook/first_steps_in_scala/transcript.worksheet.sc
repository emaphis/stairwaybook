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


1 + 2
//res0: Int = 3

res0 * 3
//res1: Int = 9

println("Hello, world!")
//Hello, world!

val msg = "Hello, world!"
//msg: String = Hello, world!

val msg2: java.lang.String = "Hello again, world!"
//msg2: String = Hello again, world!

val msg3: String = "Hello yet again, world!"
//msg3: String = Hello yet again, world!

println(msg)
//Hello, world!

//msg = "Goodbye cruel world!"
//    ^
//    error: reassignment to val

var greeting = "Hello, world!"
//greeting: String = Hello, world!

greeting = "Leave me alone, world!"
//mutated greeting

val multiLine =
  "This is the next line."

def greet() = println("Hello, world!")
//greet: ()Unit

