
object Main {

  def main(args: Array[String]): Unit = {
    println("start")

    val re = add(1, 2)
    println(re)

    val f2 = add _

    val re2 = f2(1, 2)

    println(re2)

    println(add2(2)(3))
    println(add3(1, 2)(3))
    println("end")

  }

  def add(val1: Int, val2: Int): Int = {
    val1 + val2
  }

  def add2(val1: Int)(val2: Int): Int = {
    val1 + val2
  }

  def add3(val1: Int, val2: Int)(val3: Int): Int = {
    val1 + val2 + val3
  }


}

case class Class1(name: String, value: String)

case class Class2(name: String, value: String)

case class Class3(name: String, value: String)




