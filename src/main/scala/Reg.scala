
object Reg extends App {

  println("start")

  val target = "test%{aaa} tes%{bbb}t test test test"

  val reg = "%\\{.+?\\}".r

  for (m <- reg.findAllIn(target).matchData)
    println("Found a match  [%s)".format(m.matched))

  println("end")

}
