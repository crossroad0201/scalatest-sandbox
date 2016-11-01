package sandbox.scalatest.flatspec

import org.scalatest.FlatSpec

class HelloWorldSpec extends FlatSpec {

  behavior of "HelloWorld"

  it should "sayHello" in {
    assert(HelloWorld.sayHello("World") == "Hello World!!")
  }

}
