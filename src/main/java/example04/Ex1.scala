package example04

object Ex1 {

  def main(args: Array[String]): Unit = {
    val map = Map("Computer" -> 3000, "Iphone" -> 2000, "Cup" -> 10)
    val disountMap = for ((k, v) <- map) yield (k, v * 0.9)
    disountMap.foreach(println)
  }
}