package example09.ex.ex3

import scala.io.Source

object CheckString extends App {
  val source = Source.fromFile("src/example09/ex/ex3/CheckString.txt");
  println("String length gt 12 as follows:")
  source.mkString.split("\\s+").foreach(str => if (str.length() > 12) println(str))
}