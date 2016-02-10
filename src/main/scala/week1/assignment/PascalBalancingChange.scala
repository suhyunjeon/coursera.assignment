package week1.assignment

/**
  * @author tasha.jeon
  * @since 2016. 2. 10. 
  */
object PascalBalancingChange {
  def main(args: Array[String]) {
    for (row <- 0 to 5) {
      for (col <- 0 to row) {
        print(pascal(col, row) + " ")
      }
      println()
    }
  }

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  def balance(chars: List[Char]): Boolean = {
    def balance(chars: List[Char], left: Int): Boolean =
      if(chars.isEmpty) left == 0
      else
      if (chars.head == '(') balance(chars.tail, left + 1)
      else if (chars.head == ')') left > 0 && balance(chars.tail, left - 1)
      else balance(chars.tail, left)
    balance(chars, 0)
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def countChange(money: Int, coins: List[Int]): Int =
      if (coins.isEmpty || money - coins.head < 0) 0
      else if (money - coins.head == 0) 1
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    countChange(money, coins)
  }

}