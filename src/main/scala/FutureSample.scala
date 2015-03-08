import traits.TestTrait
import scala.concurrent.{Future,Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

object FutureSample extends App with TestTrait {

  println("test")

  val f = Future {
    println("future")
  }

  f.onSuccess {
    case u: Unit =>  println("success")
  }

  val f2:Future[String] = Future {
    "f2 result"
  }

  f2.onSuccess{
    case s: String =>  println("success : " + s)
  }


  val futures: Seq[Future[Int]] = Seq(
    Future{ Thread.sleep(3000); 1 },
    Future{ Thread.sleep(2000); 2 },
    Future{ Thread.sleep(1000); 3 },
    Future{ Thread.sleep(500); 4 })

  val f3 = Future.reduce(futures){ (total, v) => total + v }
  f3.onSuccess{ case result: Int => println(result) }

  Await.ready(f3, Duration.Inf)

  Thread.sleep(2000)


  println("end")

}
