import org.scalatest._

class S99Spec extends FunSpec with Matchers {

  describe("s99のテスト") {

    it("p01") {
      s99.p01(List(1, 1, 2, 3, 5, 8)) should be(8)
    }

    it("p02") {
      s99.p02(List(1, 1, 2, 3, 5, 8)) should be (5)
    }

    it("p03") {
      s99.p03(2, List(1, 1, 2, 3, 5, 8)) should be (2)
    }

    it("p03b") {
      s99.p03Recursive(2, List(1, 1, 2, 3, 5, 8)) should be (2)
    }

    it("p04") {
      s99.p04(List(1, 1, 2, 3, 5, 8)) should be (6)
    }

    it("p05") {
      s99.p05(List(1, 1, 2, 3, 5, 8)) should be (List(8, 5, 3, 2, 1, 1))
    }

    it("p06") {
      s99.p06(List(1, 2, 3, 2, 1)) should be (true)
    }

    it("p07") {
      s99.p07(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1, 1, 2, 3, 5, 8))
    }

  }
}
