
object Main5 extends App {


  println("start")
  val o = Some(List("aa","bb"))


  val re = o.map{list => list(1)}.headOption

  print(re)



  println("end")

  

}
