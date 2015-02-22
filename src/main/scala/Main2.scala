
object Main2 extends App {


  println("aaa")

  val s = if(true) "s"


  println(s)


  println(twice(_ + 2, 5))

  val m = Map("a" -> Map("aa" -> "bb"))

  println(m("a")("aa"))


  def twice(op: Double => Double, x: Double) = op(op(x))




}
