
object Reg extends App {

  println("start")

  val target = "test%{aaa} tes%{bbb}t test test test"

  val reg = "%\\{.+?\\}".r

  val matchedList = reg.findAllIn(target).matchData

  println(matchedList)

  for (m <- reg.findAllIn(target).matchData)
    println("Found a match  [%s,%s)".format(m.matched,m.matched.drop(2).dropRight(1)))

  val m2 = for (m <- reg.findAllIn(target).matchData) yield {
    m.matched.drop(2).dropRight(1)
  }

  println(m2)

  val m3 = for (m <- reg.findAllIn(target).matchData) yield {
    m.matched.drop(2).dropRight(1)
  }

  println(m2.toList)



  println("end")

}
