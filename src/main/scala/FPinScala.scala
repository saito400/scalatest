
object FPinScala extends App {

  println("start")

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

  println(fib(0))
  println(fib(1))
  println(fib(2))
  println(fib(3))

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = as match {




    false//TODO
  }



  println("end")

}
