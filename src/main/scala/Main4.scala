
object Main4 extends App {
  println("start")

  //  val jobType: Option[Array[String]],
  //None,//if (hit("fields").asInstanceOf[Map[String, Any]].contains("jobType")) Some(hit("fields").asInstanceOf[Map[String, String]]("jobType").asInstanceOf[List[String]].toArray) else None,

  //map.get("jobType"),


  val map: Map[String, List[String]] = Map("key1" -> List("val1","val2"))


  println(map.get("key1"))



  println("end")
}
