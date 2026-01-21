# Stairwaybook source code

## Programming in Scala 5th Edition - Source Code.

Programming in Scala, 5th Edition
    A comprehensive step-by-step guide
    by Martin Odersky, Lex Spoon, Bill Venners, and Frank Sommers

The Artima book site: <https://booksites.artima.com/programming_in_scala_5ed>

The original soucre code may be found there.

This is the original source code from the book site place in an SBT project and ported to the Scala LTS version 3.3.7

As I was porting the code I took the packages as sacred so the path structure of the project matches the packages.

## Directories based on chapter

Under main\scala\org\stairwaybook

1. None
2. first_steps_in_scala
3. nextstepsinscala
4. classesandobjects
5. basictypesandoperations
6. functionalobjects
7. builtincontrolstructures
8. functionsandclosures
9. controlabstraction
10. compositionandinheritance  layout
11. Traits
12. packagesandimports
13. pattern_matching  expr
14. workingwithlists
15. workingwithothercollections
16. mutableobjects simulation
17. scalashierarchy
18. typeparameterization
19. enums_and_adts
20. abstractmembers currencies
21. givens
22. extension_methods
23. typeclasses
24. collections_in_depth

Under test\scala\org\stairwaybook

25. assertionsandtests

## Steps taken in porting

1. Code placed in an SBT project.
2. Code moved to a directory matching the package, the root package is `org.stairwaybook`
3. Fixed indenting to get some examples to comple.
