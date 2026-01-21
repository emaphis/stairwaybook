# Stairwaybook source code

Programming in Scala 5th Edition - Source Code.

Programming in Scala, 5th Edition
    A comprehensive step-by-step guide
    by Martin Odersky, Lex Spoon, Bill Venners, and Frank Sommers

The Artima book site: <https://booksites.artima.com/programming_in_scala_5ed>

The original soucre code may be found there.

This is the original source code from the book site place in an SBT project and ported to the Scala LTS version 3.3.7

As I was porting the code I took the packages as sacred so the path structure of the project matches the packages.

## Directories

2  First Steps in Scala
3  Next Steps in Scala
4  Classes and Objects
5  Basic Types and Operations
6  Functional Objects
7  Built-in Control Structures
8  Functions and Closures
9  Control Abstraction
10 Composition and Inheritance
   Layout
11 Traits
12 Packages, Imports, and Exports
13 Pattern Matching
    expr
14 Working with Lists
15 Working with Other Collections
16 Mutable Objects
    simulation
17 Scala's Hierarchy
18 Type Parameterization
19 Enums
20 Abstract Members
    currencies
21 Givens
22 Extension Methods
23 Typeclasses
24 Collections in Depth
25 Assertions and Tests

## Steps taken in porting

1. Code placed in an SBT project.
2. Code moved to a directory matching the package, the root package is `org.stairwaybook`
