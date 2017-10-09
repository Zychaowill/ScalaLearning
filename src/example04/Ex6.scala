package example04

import java.io.File
import java.util.Scanner
import scala.collection.mutable.TreeMap
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar

object Ex6 {
  
  def main(args: Array[String]): Unit = {
    val map = new LinkedHashMap[String, Int]
    
    map("Monday") = Calendar.MONDAY
    map("Tuesday") = Calendar.TUESDAY
    map("Thursday") = Calendar.THURSDAY
    map("Wednesday") = Calendar.WEDNESDAY
    map("Friday") = Calendar.FRIDAY
    map("Saturday") = Calendar.SATURDAY
    map("Sunday") = Calendar.SUNDAY
    
    map.foreach(println)
  }
}