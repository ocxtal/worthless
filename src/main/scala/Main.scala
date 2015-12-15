
object Main {

  val defaultErr = "arguments should be [integer] [integer] [+|x]."

  def main(args:Array[String]): Unit = {
    val x =
      try {args(0).toInt}
      catch {case _:Throwable => sys.error(defaultErr)}
    val y =
      try {args(1).toInt}
      catch {case _:Throwable => sys.error(defaultErr)}
    val f = args(2) match {
        case "+" => (a: Int, b: Int) => a + b
        case "x" => (a: Int, b: Int) => a * b
        case _ => sys.error(defaultErr)
      }
    val builder = new StringBuilder
    // Ummmm!! This statement is very short. Similer statements should be implimented to Dlang...  
    exe(1 to x, 1 to y, f).foreach{z => builder append z.mkString("",",","\n")}
    println(builder.init)
  }

  def exe(xs:Seq[Int], ys: Seq[Int], f:(Int,Int) => Int): Seq[Seq[Int]] = xs.map { x => ys.map(y => f(x, y))}
}