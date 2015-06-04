
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

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n + 1))) false
      else go(n + 1)
    go(0)
  }

  println(isSorted(Array(1,2,3), (i: Int, j: Int) => if(i < j) true else false))

  println(isSorted(Array(1,2,3), (i: Int, j: Int) => if(i > j) true else false))

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a, b)
  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }

  def tail[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case h :: tail => tail
  }

  val l = List(1,2,3)
  println(l.tail == tail(l))





  println("end")

}
