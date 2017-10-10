package example06.ex.ex4

object Point extends App {
  def apply(x: Int, y: Int) = {
    new Point(x, y)
  }
  
  val p = Point(3, 4)
  println(p)
}

class Point(x: Int, y: Int) {
  override def toString():String = {
    "x=" + x + " y=" + y
  }
}