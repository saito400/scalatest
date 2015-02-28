
object s99 extends App {

  println(p01(List(1, 1, 2, 3, 5, 8)))

  def p01(l: List[Int]): Int = {
    l.last
  }

  def p02[A](list: List[A]): A = list match {
    case t :: _ :: Nil => t
    case _ :: tail => p02(tail)
    case _ => throw new NoSuchElementException
  }

  def p03[A](position: Int, list: List[A]): A = {
    list(position)
  }

  def p03Recursive[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => p03Recursive(n - 1, tail)
  }

  def p04[A](l: List[A]): Int = {

    l.length
  }

  def p05[A](l: List[A]): List[A] = {

    l.reverse

  }

  def p06[A](ls: List[A]): Boolean = ls == ls.reverse

  def p07(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => p07(ms)
    case e => List(e)
  }

  def p08[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }

  def p09[A](ls: List[A]): List[List[A]] = {
    val (packed, next) = ls span { _ == ls.head }
    if (next == Nil) List(packed)
    else packed :: p09(next)
  }

}
