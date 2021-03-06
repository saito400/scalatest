import org.scalatest._


class FPinScalaTest extends FunSpec with Matchers {
  describe("FP in Scalaのテスト") {
    it("fib") {
      FPinScala.fib(0) should be(0)
      FPinScala.fib(1) should be(1)
      FPinScala.fib(2) should be(1)
    }

    it("isSorted") {
      FPinScala.isSorted(Array(1,2,3), (i: Int, j: Int) => if(i < j) true else false ) should be (true)
      FPinScala.isSorted(Array(1,3,2), (i: Int, j: Int) => if(i < j) true else false ) should be (false)
    }

    it("tail") {
      FPinScala.tail(List(1,2,3)) should be (List(2,3))
    }

    it("setHead") {
      FPinScala.setHead(List(1,2,3),2) should be (List(2,2,3))
    }

    it("drop") {
      FPinScala.drop(List(1,2,3),2) should be (List(3))
    }

    it("drop 2") {
      FPinScala.drop(List(1,2,3),1) should be (List(2, 3))
    }

    it("dropWhile") {
      FPinScala.dropWhile(List(1,2,3),(i: Int) => if(i < 3) true else false) should be (List(3))
    }

    it("dropWhile 2") {
      FPinScala.dropWhile(List(1,2,3),(i: Int) => if(i == 2) true else false) should be (List(1, 2, 3))
    }

    it("init") {
      FPinScala.init(List(1,2,3)) should be (List(1, 2))
    }

    it("length") {
      FPinScala.length(List(1,2,3)) should be (3)
    }

    it("length2") {
      FPinScala.length2(List(1,2,3)) should be (3)
    }

    it("sum") {
      FPinScala.sum(List(1,2,3)) should be (6)
    }

    it("product") {
      FPinScala.sum(List(1,2,3)) should be (6)
    }

    it("reverse") {
      FPinScala.reverse(List(1,2,3)) should be (List(3,2,1))
    }

    it("reverse 2") {
      FPinScala.reverse(List(1,2,3,4)) should be (List(4,3,2,1))
    }


  }
}
