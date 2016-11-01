package sandbox.scalatest.funsuite

import org.scalatest.FunSuite

class HelloWorldSuite extends FunSuite {

  test("testSayHello") {
    assert(HelloWorld.sayHello("World") == "Hello World!!")
  }

}
