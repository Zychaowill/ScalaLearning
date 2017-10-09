package example04

import java.io.File
import java.util.Scanner
import scala.collection.mutable.TreeMap

object Ex5 {
  
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("src/example04/file"))
    val treeMap = new TreeMap[String, Int]
    
    var key:String = null
    while (in.hasNext()) {
      key = in.next()
      treeMap(key) = treeMap.getOrElse(key, 0) + 1
    }
    treeMap.foreach(println)
  }
}