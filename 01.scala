object GFG {
  def fact(n: Int): Int = {
    if (n == 1) 1
    else n * fact(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println(fact(3))
  }
}

// This could be right though
