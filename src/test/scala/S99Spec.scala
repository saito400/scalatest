import org.scalatest._

class S99Spec extends FunSpec with Matchers {

  describe("s99のテスト") {

    it("p01") {

      s99.p01(List(1, 1, 2, 3, 5, 8)) should be(8)
    }

  }

}
