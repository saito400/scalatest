import org.scalatest._


class FPinScalaTest extends FunSpec with Matchers {
  describe("s99のテスト") {
    it("fib") {
      FPinScala.fib(0) should be(0)
      FPinScala.fib(1) should be(1)
      FPinScala.fib(2) should be(1)
    }

    it("isSorted") {
      FPinScala.isSorted(Array(1,2,3), (i: Int, j: Int) => if(i < j) true else false ) should be (true)
      FPinScala.isSorted(Array(1,3,2), (i: Int, j: Int) => if(i < j) true else false ) should be (false)
    }


  }
}
