
import org.scalatest._


class EffectiveScalaTest  extends FunSpec with Matchers {

  describe("EffectiveScalaのテスト") {

    it("mapF") {
      EffectiveScala.mapF(Seq(Some(1),None)) should be(Seq(1,None))
    }

  }

}




