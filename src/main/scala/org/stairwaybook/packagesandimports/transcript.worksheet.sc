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

case class PosInt(value: Int):
  require(value > 0)

  // def +(x: Int): Int = value + x
  export value.*
 // export value.{<< as shl, >> as shr, >>> as ushr, *}

val x1 = PosInt(99)
x1 + 1 // 100
x1 - 1 // 98
x1 / 3 // 33


val x2 = PosInt(24)
x2 << 1 // 48 (shift left)
x2 >> 1 // 12 (shift right)
x2 >>> 1 // 12 (unsigned shift right)


case class PosInt2(value: Int):
  require(value > 0)

  export value.{<< as shl, >> as shr, >>> as ushr, *}

val x3 = PosInt2(24)
x3 shl 1 // 48
x3 shr 1 // 12
x3 ushr 1 // 12

// x3 >>> 1
