package sandbox.scalatest.propspec

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class NumberUtilSpec extends PropSpec with TableDrivenPropertyChecks with Matchers {

  property("true if positive value") {
    forAll(Table(
      "positive",
      0,
      1,
      2,
      Int.MaxValue
    )) { v =>
      NumberUtil.isPositive(v) shouldBe true
    }
  }

  property("false if negative value") {
    forAll(Table(
      "negative",
      -1,
      -2,
      Int.MinValue
    )) { v =>
      NumberUtil.isPositive(v) shouldBe false
    }
  }

}
