import scala.language.postfixOps

object Main {


  def fib(n: Int): Int = {
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }
}



}
