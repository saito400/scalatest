
object Main2 extends App {


  println("aaa")

  val s = if(true) "s"


  println(s)


  println(twice(_ + 2, 5))

  val m = Map("a" -> Map("aa" -> Map("aaa" -> "bbb")))

  println(m)
  println(m("a")("aa")("aaa"))

  mapTest(m)

  def twice(op: Double => Double, x: Double) = op(op(x))

  def mapTest(m: Map[String,Any]) = {

    val mm = m match {
      case m: Map[_,_] => m("a")
      case _ => None

    }

    println("mm : " + mm)

  }


}
