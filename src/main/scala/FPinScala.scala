
object FPinScala extends App {

  println("start")

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n + 1))) false
      else go(n + 1)
    go(0)
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a, b)
  }

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }

  def tail[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case h :: tail => tail
  }

  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil => Nil
    case head :: tail => h :: tail
  }

  @annotation.tailrec
  def drop[A](l: List[A], i: Int): List[A] = (l, i) match {
    case (Nil, _) => Nil
    case (h, 0) => h
    case (l, i) => drop(l.tail, i - 1)
  }

  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case h :: tail => if (f(h) == true) dropWhile(tail, f) else h :: tail 
  }

  def init[A](l: List[A]): List[A] = {
    l.reverse.tail.reverse
  }

  def length[A](l: List[A]): Int = l.foldRight(0)((_,acc) => acc + 1)

  def length2[A](l: List[A]): Int = l.foldLeft(0)((acc,_) => acc + 1)



  println("end")

}
