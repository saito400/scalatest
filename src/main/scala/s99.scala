
object s99 extends App {




  println(p01(List(1, 1, 2, 3, 5, 8)))

  def p01(l: List[Int]): Int ={

    l.last

  }

  def p02[A](list: List[A]):A = list match {
    case t :: _ ::Nil => t
    case _ :: tail     => p02(tail)
    case _ => throw new NoSuchElementException
  }

}
