import scala.concurrent.{ Future, Await }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

object FutureSample2 extends App {

  println("start")


  val f2: Future[String] = Future {
    "f2 result"
  }

  f2.onSuccess {
    case s: String => println("success : " + s)
  }

  val f3: Future[String] = Future {
    "f3 result"
  }

  val ft: Future[(String, String)] = for {
    res1 <- f2
    res2 <- f3
  } yield {
    (res1, res2)
  }

  try {
    val re = Await.result(ft, 10.seconds)
    println(re)
  } catch {
    case ex: TimeoutException =>
      println("error")
  }


  Thread.sleep(2000)

  println("end")

}
