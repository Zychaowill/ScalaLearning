package example09.ex.ex4

import scala.io.Source

object ReadNumber extends App {
  val pattern = "[0-9]+(\\.\\d+)?".r;
  val source = Source.fromFile("src/example09/ex/ex4/Test.data")

  val oneString = source.mkString
  val numArray = pattern.findAllIn(oneString).toArray

  var total = numArray.map(x => x.toDouble).sum
  println("size: " + numArray.size)
  println("sum: " + total)
  println("average: " + total / numArray.size)
  println("max: " + "" + numArray.max)
  println("min: " + "" + numArray.min)
}