package example04

object Ex9 {

  def main(args: Array[String]): Unit = {
    val v = 3
    val array = Array(1, 1, 2, 2, 3, 3, 4, 5, 6)
    val tuple = iteqgt(array, v)
    println("< " + v + " count: " + tuple._1)
    println("= " + v + " count: " + tuple._2)
    println("> " + v + " count: " + tuple._3)
  }

  def iteqgt(values: Array[Int], v: Int) = {
    val buffer = values.toBuffer
    (buffer.count(_ < v), buffer.count(_ == v), buffer.count(_ > v))
  }
}