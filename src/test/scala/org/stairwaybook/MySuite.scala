// Test to see if scalatest is set up correctly.

import org.scalatest.funsuite.AnyFunSuite
import org.stairwaybook.CubeCalculator

class CubeCalculatorTest extends AnyFunSuite:
  test("CubeCalulator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
