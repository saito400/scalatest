import scala.concurrent.{ Future, Await }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

object FutureSample3 extends App {

  println("start")


  val f: Future[(String, String)] = for {
    res1 <- Future {
      "result 1"
    }
    res2 <- Future {
      "result 2"
    }

  } yield {
    (res1, res2)
  }

  try {
    val re = Await.result(f, 10.seconds)
    println(re)
  } catch {
    case e: TimeoutException =>
      println(e.toString())
  }

  println("end")

}
