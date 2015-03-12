
object Main6 extends App {

  println("start")

//  val v = Seq((1,"val1",1),(1,"val2",2),(1,"val3",3))
  val v = Seq((1,1,1),(1,1,2),(1,1,3),(1,2,1),(1,2,3),(2,1,1),(2,1,2))



  println(v)

//  val v2 = v.map{t => t._1}.toSeq
//  println(v2)
//
//  val v3 = v.map{t => t._1}.distinct
//  println(v3)
//
//  val m = v.groupBy(_._1)
//  println(m)
//
//  val m2 = v.map(t => (t._1, t._2)).groupBy(_._1)
//  println(m2)
//
  val m3 = v.map(t => (t._1, t._2)).groupBy(_._1).map(x => x._1 -> x._2.distinct)
  println(m3)

//  val m4 = v.map(t => (t._2, t._3)).groupBy(_._1)
//  println(m4)

  val m5 = v.map(t => (t._2, t._3)).groupBy(_._1).map(x => x._1 -> x._2.distinct)
  println(m5)

  val m6 = v.groupBy(_._1).map(x => x._1 -> x._2.distinct)
  println("m6")
  println(m6)
  println("m6 foreach")
  m6.valuesIterator.foreach(println _)
  println("m6 map")
  val m7 = m6.valuesIterator.map(t => t.map(x => (x._2,x._3)))
  println(m7)
  m7.foreach(println _)

  println("end")

}
