object MyProgram:
  def abs(n: Int): Int =
    if n < 0 then -n
    else n

  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))

  @main def printAbs: Unit =
    println(formatAbs(-42))

  // A definition of factorial, using a local, tail recursive function
  def factorial(n: Int): Int =
    def go(n: Int, acc: Int): Int =
      if n <= 0 then acc
      else go(n-1, n*acc)

    go(n, 1)

  // Another implementation of `factorial`, this time with a `while` loop
  def factorial2(n: Int): Int =
    var acc = 1
    var i = n
    while (i > 0) { acc *= i; i -= 1 }
    acc

~                                                                               
~                               

