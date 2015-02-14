
object Main {

  def main(args: Array[String]): Unit = {
    println("start")

    val re = add(1,2)
    println(re)

    val f2 = add _

    val re2 = f2(1,2)

    println(re2)
    println("end")

  }


  def add(val1: Int, val2: Int): Int = {


    val1 + val2


  }


}
