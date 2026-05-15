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


def containsNeg(nums: List[Int]): Boolean =
   var exists = false
   for num <- nums do
     if num < 0 then
       exists = true
   exists

def containsNeg1(nums: List[Int]) = nums.exists(_ < 0)
//containsNeg1: (nums: List[Int])Boolean

def containsOdd(nums: List[Int]): Boolean =
   var exists = false
   for num <- nums do
     if num % 2 == 1 then
       exists = true
   exists

def containsOdd1(nums: List[Int]) = nums.exists(_ % 2 == 1)
//containsOdd1: (nums: List[Int])Boolean

var assertionsEnabled = true

def myAssert(predicate: () => Boolean) =
 if assertionsEnabled && !predicate() then
   throw new AssertionError

def boolAssert(predicate: Boolean) =
   if assertionsEnabled && !predicate then
     throw new AssertionError
