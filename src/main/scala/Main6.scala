
object Main6 extends App {


  

  println("start")

//  val v = Seq((1,"val1",1),(1,"val2",2),(1,"val3",3))
  val v = Seq((1,1,1),(1,1,2),(1,1,3),(1,2,1),(1,2,3))



  println(v)

  val v2 = v.map{t => t._1}.toSeq

  println(v2)

  val v3 = v.map{t => t._1}.distinct
  println(v3)




  println("end")

  

}
