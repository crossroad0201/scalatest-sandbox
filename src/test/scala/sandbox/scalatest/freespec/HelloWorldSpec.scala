package sandbox.scalatest.freespec

import org.scalatest.{FreeSpec, Matchers}

class HelloWorldSpec extends FreeSpec with Matchers {

  // MEMO - とか in がimplicitコンバージョンで変換されるので、コンパイラに負担かかりそう
  "HelloWorld" - {
    "sayHello" - {
      "sayHello" in {
        HelloWorld.sayHello("World") should equal ("Hello World!!")
      }
    }
  }

}
