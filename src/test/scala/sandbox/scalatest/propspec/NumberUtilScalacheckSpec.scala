package sandbox.scalatest.propspec

import org.scalacheck.Gen._
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{FlatSpec, Matchers}

class NumberUtilScalacheckSpec extends FlatSpec with GeneratorDrivenPropertyChecks with Matchers {

  "NumberUtil.isPositive" should "true if positive value" in {
    forAll(choose(0, Int.MaxValue)) { v =>
      println(s"Generated value = $v")
      NumberUtil.isPositive(v) shouldBe true
    }
  }

  "NumberUtil.isPositive" should "false if negative value" in {
    forAll(choose(Int.MinValue, -1)) { v =>
      println(s"Generated value = $v")
      NumberUtil.isPositive(v) shouldBe false
    }
  }

}
