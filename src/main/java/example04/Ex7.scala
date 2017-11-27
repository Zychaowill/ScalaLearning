package example04

import scala.collection.JavaConversions.propertiesAsScalaMap

object Ex7 {
  
  def main(args: Array[String]): Unit = {
    val props:scala.collection.Map[String, String] = System.getProperties()
    val keys = props.keys
    val keylens = for (i <- keys) yield i.length()
    val keymaxlen = keylens.max
    
    for (key <- keys) {
      print(key)
      print("_" * (keymaxlen - key.length()))
      print("|")
      println(props(key))
    }
  }
}