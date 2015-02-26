
object Main3 extends App {

  println("start")

  //(salary.hourly.max,List(1800))

  val map: Map[String, List[Int]] = Map("salary.hourly.average" -> List(1800))


  val re = map.get("salary.hourly.average").map(_.head.toLong).getOrElse(0)

  println("end")

}
