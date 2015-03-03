import org.scalatest._

class s99Spec extends FunSpec with Matchers {

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

    it("p07b") {
      s99.p07(List(List(1, 1), 2, List(3, List(5, 8), List(6, List(5, 8))))) should be (List(1, 1, 2, 3, 5, 8, 6, 5, 8))
    }

    it("p08") {
      s99.p08(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List('a, 'b, 'c, 'a, 'd, 'e))
    }

    it("p09") {
      s99.p09(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }

    it("p10") {
      s99.p10(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }

    it("p11") {
      s99.p11(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    }

    it("p12") {
      s99.p12(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    }

    it("p13") {
      s99.p13(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }

    it("p14") {
      s99.p14(List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    }

    it("p15") {
      s99.p15(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
    }

    it("p16") {
      s99.p16(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    }

    it("p17") {
      s99.p17(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }


  }
}
