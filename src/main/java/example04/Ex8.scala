package example04

object Ex8 {
  
  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 65, 6, 7)
    var tuple:(Int, Int) = minmax(array)
    println(tuple._1 + " " + tuple._2)
  }
  
  def minmax(values:Array[Int]) = {
    (values.min, values.max)
  }
}