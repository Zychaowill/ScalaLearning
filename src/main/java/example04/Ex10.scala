package example04

object Ex10 {

  def main(args: Array[String]): Unit = {
    val tuple = "Hello".zip("World")
    println(tuple.toMap)
    tuple.foreach(println)
  }
}