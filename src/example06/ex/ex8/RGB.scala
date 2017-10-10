package example06.ex.ex8

object RGB extends Enumeration with App {
  val RED = Value(0xff0000, "Red")
  val BLACK = Value(0x000000, "Black")
  val GREEN = Value(0x00ff00, "Green")
  val CYAN = Value(0x00ffff, "Cyan")
  val YELLOW = Value(0xffff00, "Yellow")
  val WHITE = Value(0xffffff, "White")
  val BLUE = Value(0x0000ff, "Blue")
  val MAGENTA = Value(0xff00ff, "Magenta")
}