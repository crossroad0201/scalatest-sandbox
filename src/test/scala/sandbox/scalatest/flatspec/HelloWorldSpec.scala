package sandbox.scalatest.flatspec

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldSpec extends FlatSpec with Matchers {

  behavior of "HelloWorld"

  it should "sayHello" in {
    HelloWorld.sayHello("World") should equal ("Hello World!!")
  }

}
