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

  def p10[A](ls: List[A]): List[(Int, A)] =
    p09(ls) map { e => (e.length, e.head) }

  def p11[A](ls: List[A]): List[Any] =
    p10(ls) map { t => if (t._1 == 1) t._2 else t }

  def p12[A](ls: List[(Int, A)]): List[A] = 
    ls flatMap { e => List.fill(e._1)(e._2) }


  def p13[A](ls: List[A]): List[(Int, A)] =
    if (ls.isEmpty) Nil    else {
      val (packed, next) = ls span { _ == ls.head }
      (packed.length, packed.head) :: p13(next)
    }

  def p14[A](ls: List[A]): List[A] = {
    ls flatMap { e => List.fill(2)(e)}
  }

  def p15[A](i: Int, ls: List[A]): List[A] = {
    ls flatMap { e => List.fill(i)(e)}
  }

  def p16[A](i: Int, li: List[A]): List[A] = {
    li.zipWithIndex filter { v => (v._2 + 1) % i != 0 } map { _._1 }
  }

  def p17[A](i: Int, li: List[A]): (List[A],List[A]) = {
    li.splitAt(i)

  }

  def p18[A](b:Int, e:Int, l: List[A]): List[A] = {
    l.slice(b, e)
  }

  def p19[A](i: Int, l: List[A]): List[A] = {
    val p = if (i > 0) i else l.size + i
    val (ll, lr) = l.splitAt(p)
    lr ::: ll
  }

  def p20[A](i: Int, l:List[A]): (List[A], A) = l.splitAt(i) match {
    case (Nil,_) if i < 0 => throw new Exception
    case (pre,e::post) => (pre ::: post, e)
    case (pre, Nil) => throw new Exception
  }

  def p21[A](v: A, i: Int, l: List[A]) : List[A] = {
    l.take(i) ::: List(v) ::: l.drop(i)

  }

  def p22(f: Int, t: Int): List[Int] = {
    (f to t).toList
  }

  def p23[A](n: Int, ls: List[A]): List[A] =
    if (n <= 0) Nil
    else {
      val (rest, e) = p20((new util.Random).nextInt(ls.length), ls)
      e :: p23(n - 1, rest)
    }

  def p32(i: Int, j: Int) :Int = {
    if(j == 0) i else p32(j, i % j)
  }

  implicit class p33(val start: Int) {
    def isCoprimeTo(n: Int): Boolean = p32(start, n) == 1
  }

  implicit class p34(val start: Int) {
    def totient: Int = (1 to start).filter( start.isCoprimeTo(_) ).length
  }

}
