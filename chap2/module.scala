import scala.language.postfixOps


object MyModule {
    def abs(n : Int) : Int =
	if (n < 0) -n 
	else n

    private def formatAbs(x : Int) = {
	val msg = "The absolute value of %d is %d"
	msg.format(x, abs(x))
	}
	
     def formatResult(name : String, n : Int, f : Int => Int) = {
        val msg = "The format %s of %d is %d"
        msg.format(n , f(n))
     }

     def factorial(n : Int) = {
        def go(n : Int, acc : Int) : Int = {
          if (n <= 0) acc
          else go(n-1, n*acc)
        } 
     }

   def main(args : Array[String]) : Unit = {
      println(formatResult("Absolute value", 42, abs))
      println(formatResult("factorial", 7, factorial))
   }

}
