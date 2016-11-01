package sandbox.scalatest.wordspec

import org.scalatest.WordSpec

class HelloWorldSpec extends WordSpec {

  "HelloWorld" when {
    "sayHello" should {
      "Given name" in {
        assert(HelloWorld.sayHello("World") == "Hello World!!")
      }
    }
  }

}
