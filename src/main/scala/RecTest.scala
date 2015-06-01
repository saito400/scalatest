
object RecTest extends App {

  println("test")


  case class Entity(i: Int, s: String)

  val l = List(Entity(0, "a"), Entity(1, "b"), Entity(2, "b"), Entity(3, "c"))

  def removeDuplicates(xs: List[Entity]): List[Entity] = {
    if (xs.isEmpty) xs
    else xs.head :: removeDuplicates(
      xs.tail filter (x => x.s != xs.head.s)
    )
  }

  println(l)

  println(removeDuplicates(l))

  println("end")

}
