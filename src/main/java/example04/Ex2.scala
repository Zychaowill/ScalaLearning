package example04

import java.util.Scanner
import java.io.File
import scala.collection.mutable.HashMap

object Ex2 {
  
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("src/example04/file"))
    val maps = new HashMap[String, Int]
    
    var key:String = null
    while (in.hasNext()) {
      key = in.next()
      maps(key) = maps.getOrElse(key, 0) + 1
    }
    maps.foreach(println)
  }
}