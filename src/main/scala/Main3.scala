
object Main3 extends App {

  println("start")




  val map: Map[String, List[Any]] = Map("key1" -> List(1800))


  f(map)
  println("end")



  def f(map: Map[String, List[Any]])  = {

//    val m = map.asInstanceOf[Map[String, List[String]]]
//    val re = m.get("key1").map(_.head.toLong).getOrElse(0)

    val m2 = map.asInstanceOf[Map[String, List[Int]]]
    val re2 = m2.get("key1").map(_.head.toLong).getOrElse(0)

    println(re2)

  }
}
