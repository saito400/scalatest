import traits.TestTrait
object Tmp extends App with TestTrait {

  println("test")

  val list = List("aaa","aaa","bbb","ccc","ccc")

  println(list)

//  list.

  println("aaaaa")


  val s = ("header %{param1} %{param2} footer" -> "")

  val p = Seq(("param1" -> "val1"),("param2" -> "val2"))

  val re = p.fold(s)((a,b) => a._1.replaceAll("%\\{" + b._1 + "?\\}",b._2) -> "" )

  println(re._1)

}
