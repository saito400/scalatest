
object Reg extends App {

  println("start")

  val target = "test%{aaa} tes%{bbb}t test test test"

  val reg = "%\\{.+?\\}".r

  for (m <- reg.findAllIn(target).matchData)
    println("Found a match  [%s,%s)".format(m.matched,m.matched.drop(2).dropRight(1)))

  println("end")

}
