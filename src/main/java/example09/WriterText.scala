package example09

import java.io.PrintWriter

object WriterText {
  def main(args: Array[String]): Unit = {
    val out = new PrintWriter("src/example09/numbers.txt")
    
    for (i <- 1 to 100) out.println(i)
    
    val quantity = 3000
    val price = 18000.98
    
    printf("%06d %010.2f", quantity, price)
    out.close()
  }
}