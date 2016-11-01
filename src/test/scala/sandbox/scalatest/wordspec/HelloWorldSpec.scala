package sandbox.scalatest.wordspec

import org.scalatest.{Matchers, WordSpec}

class HelloWorldSpec extends WordSpec with Matchers {

  // MEMO when とか should がimplicitコンバージョンで変換されるので、コンパイラに負担かかりそう
  "HelloWorld" when {
    "sayHello" should {
      "Given name" in {
        HelloWorld.sayHello("World") should equal ("Hello World!!")
      }
    }
  }

}
