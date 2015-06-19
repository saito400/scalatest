
object Tmp extends App {

  println("start")


  val re = List(
    ("Ａ" -> "a")
    ,("A" -> "a")
  )

  val s = "ＡａAB"

  println(s)


  println(_replace(s, re))


  println("end")



  @scala.annotation.tailrec
  def _replace(s: String, parameters: List[(String, String)]): String = {

    parameters match {
      case Nil => s
      case (k, v) :: t => _replace(s.replaceAll(k, v), t)
    }


  }
}
