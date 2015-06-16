import scala.concurrent.{Future,Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

object Future4 extends App {

  println("start")

  val f = Future {
    Thread.sleep(3000)
    println("future")
  }

  f.onSuccess {
    case u: Unit =>  println("success")
  }


  Await.ready(f, Duration.Inf)

  Thread.sleep(5000)


  println("end")

}
