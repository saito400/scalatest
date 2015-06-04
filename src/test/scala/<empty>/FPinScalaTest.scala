import org.scalatest._


class FPinScalaTest extends FunSpec with Matchers {
  describe("s99のテスト") {
    it("fib") {
      FPinScala.fib(0) should be(0)
      FPinScala.fib(1) should be(1)
      FPinScala.fib(2) should be(1)

    }




  }
}
