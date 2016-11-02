package sandbox.scalatest.propspec

import org.scalacheck.Gen._
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{FlatSpec, Matchers}

class NumberUtilScalacheckSpec extends FlatSpec with GeneratorDrivenPropertyChecks with Matchers {

  "NumberUtil.isPositive" should "true if positive value" in {
    forAll(posNum[Int]) { v =>
      println(s"Generated value = $v")
      NumberUtil.isPositive(v) shouldBe true
    }
  }

  "NumberUtil.isPositive" should "false if negative value" in {
    forAll(negNum[Int]) { v =>
      println(s"Generated value = $v")
      NumberUtil.isPositive(v) shouldBe false
    }
  }

}
