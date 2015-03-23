
object Reg extends App {

  println("start")

  val target = "test test test test test"

  val reg = "te".r

  for (m <- reg.findAllIn(target).matchData)
    println("Found a match  [%s)".format(m.matched))

  println("end")

}
