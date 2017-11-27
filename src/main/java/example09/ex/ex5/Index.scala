package example09.ex.ex5

import scala.io.Source
import java.io.PrintWriter

object Index extends App {
  val fileName = "src/example09/ex/ex5/Result.txt"
  val source = Source.fromFile(fileName)
  val out = new PrintWriter(fileName)
  
  for (i <- 0 to 20)
    out.println(outIndex(i))
  
  out.close()
  println("It's OK!")
    
  def outIndex(n: Int): String = {
    val value = math.pow(2, n)
    val negValue = math.pow(2, -n)
    value.toInt + "\t" + (negValue)
  }
}