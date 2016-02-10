package week1.assignment

import org.scalatest.FunSuite
import week1.assignment.PascalBalancingChange._

/**
  * @author tasha.jeon
  * @since 2016. 2. 10. 
  */
class PascalBalancingChangeSuite extends FunSuite {

  test("[Exercise 1] Run Pascal’s Triangle") {
    for (row <- 0 to 5) {
      for (col <- 0 to row) {
        print(pascal(col, row) + " ")
      }
      println()
    }
  }

  test("[Exercise 2] Parentheses Balancing") {
    assert(balance("(just an) example".toList) == true)
    assert(balance("(if (zero? x) max (/ 1 x))".toList) == true)
    assert(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList) == true)
    assert(balance(":-)".toList) == false)
    assert(balance("())(".toList) == false)
  }

  test("[Exercise 3] Run Counting Change") {
    assert(countChange(25, List(5,10)) == 3)
    assert(countChange(7, List(1, 5,10)) == 2)
    assert(countChange(35, List(5,10, 25)) == 6)
  }
}
