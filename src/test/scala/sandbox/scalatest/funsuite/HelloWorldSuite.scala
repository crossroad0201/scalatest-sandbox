package sandbox.scalatest.funsuite

import org.scalatest.{FunSuite, Matchers}

class HelloWorldSuite extends FunSuite with Matchers {

  test("testSayHello") {
    HelloWorld.sayHello("World") should equal ("Hello World!!")
  }

}
