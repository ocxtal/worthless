/**
  * Created by yuto on 15/12/15.
  */
import org.scalatest.FunSuite
class MainTest extends FunSuite{
  val x = 2
  val y = 4
  test("+"){
    val tmp = Main.exe(1 to 2, 1 to 4, (a:Int, b: Int) => a + b)
    assert(tmp(0).toArray sameElements Array(2,3,4,5))
    assert(tmp(1).toArray sameElements Array(3,4,5,6))
  }
  test("x"){
    val tmp = Main.exe(1 to x, 1 to y, (a:Int, b: Int) => a * b)
    assert(tmp(0).toArray sameElements Array(1,2,3,4))
    assert(tmp(1).toArray sameElements Array(2,4,6,8))
  }
}
