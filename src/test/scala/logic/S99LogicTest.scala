package logic

import org.scalatest._



class S99LogicTest extends FunSpec with Matchers {

  describe("s99のテスト") {

    it("p46") {
      S99Logic.p46And(true,true) should be(true)
    }


  }

}
