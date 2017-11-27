package example09

import scala.io.Source

object ReadFromURL {
  def main(args: Array[String]): Unit = {
    val source1 = Source.fromURL("http://www.baidu.com", "UTF-8")
    val source2 = Source.fromString("Hello, World!")
    val source3 = Source.stdin
    
    println(source1.mkString)
    
    source1.close()
    source2.close()
    source3.close()
  }
}