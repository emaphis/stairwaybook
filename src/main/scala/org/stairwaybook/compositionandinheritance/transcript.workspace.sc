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

object Vec1:

  abstract class Element:
     def contents: Vector[String]
     val height = contents.length
     val width = if height == 0 then 0 else contents(0).length

  class VectorElement(conts: Vector[String]) extends Element:
    def contents: Vector[String] = conts


object Vec2:

  abstract class Element:
   def demo = "Element's implementation invoked"

  class VectorElement extends Element:
   override def demo = "VectorElement's implementation invoked"


  class LineElement extends VectorElement:
   override def demo = "LineElement's implementation invoked"


  // UniformElement inherits Element's demo
  class UniformElement extends Element

  def invokeDemo(e: Element) = e.demo


object Vec3:

  abstract class Element:
    def demo = "Element's implementation invoked"

  class VectorElement extends Element:
   final override def demo =
     "VectorElement's implementation invoked"

  class LineElement extends VectorElement:
    override def demo = "LineElement's implementation invoked"


object Vec4:

  abstract class Element:
    def demo = "Element's implementation invoked"

  final class VectorElement extends Element:
    override def demo = "VectorElement's implementation invoked"

  class LineElement extends VectorElement:
    override def demo = "LineElement's implementation invoked"


  Vector(1, 2, 3).zip(Vector("a", "b"))
  //res0: scala.collection.immutable.Vector[(Int, String)] = Vector((1,a), (2,b))

