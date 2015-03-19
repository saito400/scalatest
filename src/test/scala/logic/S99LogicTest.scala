package logic

import org.scalatest._



class S99LogicTest extends FunSpec with Matchers {

  describe("s99のテスト") {

    it("p46And") {
      S99Logic.p46And(true,true) should be(true)
    }

//    it("p49") {
//      S99Logic.p49(1) should be ("0", "1")
//    }

  }

}
