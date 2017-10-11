package example09.ex.ex1

import scala.io.Source
import java.io.PrintWriter

object ReverseLines extends App {
  val srcFile = "src/example09/README.md"
  val reverseFile = "src/example09/ex/ex1/ReverseFile.txt"
  
  val source = Source.fromFile(srcFile)
  lazy val reSource = Source.fromFile(reverseFile)
  lazy val out = new PrintWriter(reverseFile)
  
  val lineIterator = source.getLines
  val lineRecord = lineIterator.toArray
  val reverseRecord = lineRecord.reverse
  
  reverseRecord.foreach(line => out.write(line + "\n"))
  out.close()
  
  println("Source file contents:")
  lineRecord.foreach(println)
  
  println("New file contents:")
  println(reSource.mkString)
}