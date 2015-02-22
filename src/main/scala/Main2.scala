
object Main2 extends App {


  println("aaa")

  val s = if(true) "s"


  println(s)


  println(twice(_ + 2, 5))

  val m = Map("a" -> Map("aa" -> "bb"))

  println(m)
  println(m("a")("aa"))

  mapTest(m)

  def twice(op: Double => Double, x: Double) = op(op(x))

  def mapTest(m: Map[String,Any]) = {

    val mm = m match {
      case m: Map[String,Map[String,String]] => m("a")("aa")
      case _ => None

    }

    println(mm)

  }


}
