package example09

import scala.io.Source

object ReadWithRegex {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/example09/README.md")
    
    val tokens = source.mkString.split("\\S+")
//    val numbers = for (w <- tokens) yield w.toDouble
    /*val numbers = tokens.map(_.toDouble)
    numbers.foreach(println)*/
    
    print("How old are you?")
    val age = readInt()
    println(age)
  }
}