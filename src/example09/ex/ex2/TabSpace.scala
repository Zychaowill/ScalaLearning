package example09.ex.ex2

import scala.io.Source
import java.io.PrintWriter

object TabSpace extends App {
  val base = "src/example09/ex/ex2/"
  val srcFile = base + "TabSpace.txt"
  val newFile = base + "newTabSpace.txt"
  
  val lineIterator = Source.fromFile(srcFile).getLines()
  lazy val newLineIterator = Source.fromFile(newFile).getLines()
  lazy val out = new PrintWriter(newFile)
  val lineRecord = lineIterator.toArray
  
  println(srcFile + " as follows:")
  lineRecord.foreach(println)
  lineRecord.foreach(line => out.write(line.replaceAll("\t", "") + "\n"))
  out.close()
  
  println(newFile + "as follows:")
  newLineIterator.foreach(println)
}