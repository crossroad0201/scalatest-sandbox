package sandbox.scalatest.funspec

import org.scalatest.{FunSpec, Matchers}

class HelloWorldSpec extends FunSpec with Matchers {

  describe("HelloWorld") {
    describe("sayHello") {
      it("should sayHello") {
        HelloWorld.sayHello("World") should equal ("Hello World!!")
      }
    }
  }

}
