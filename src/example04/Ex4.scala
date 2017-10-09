package example04

import java.io.File
import java.util.Scanner
import scala.collection.mutable.SortedMap

object Ex4 {

  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("src/example04/file"))
    val sortMap = SortedMap[String, Int]()

    var key: String = null
    while (in.hasNext()) {
      key = in.next()
      sortMap(key) = sortMap.getOrElse(key, 0) + 1
//      sortMap += (key -> (sortMap.getOrElse(key, 0) + 1))
    }
    sortMap.foreach(println)
  }
}