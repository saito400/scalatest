import scala.annotation.tailrec

object RecTest extends App {

  println("test")

  case class Entity(i: Int, s: String)
  val l = List(Entity(0, "a"), Entity(1, "b"), Entity(2, "b"), Entity(3, "c"))

//  @tailrec
  def removeDuplicates(xs: List[Entity]): List[Entity] = {
    if (xs.isEmpty) xs
    else xs.head :: removeDuplicates(xs.tail filter (x => x.s != xs.head.s))
  }

//  @tailrec
  def removeDuplicates2(l: List[Entity]): List[Entity] = l match {
    case Nil => Nil
    case _ => l.head :: removeDuplicates(l.tail filter (x => x.s != l.head.s))
  }





  println(l)

  println(removeDuplicates(l))

  println(l.groupBy(_.s).mapValues(_.head))

  println(l.groupBy(_.s).mapValues(_.head).toSeq)

  println(l.groupBy(_.s).mapValues(_.head).values)

  println(l.groupBy(_.s).mapValues(_.head).values.toList)


  println("end")

}
