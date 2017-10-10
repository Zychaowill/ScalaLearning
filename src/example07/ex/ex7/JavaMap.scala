package example07.ex.ex7

object JavaMap {
  import java.util.{ HashMap => JHashMap }
  import scala.collection.mutable.HashMap

  def transMapValues(javaMap: JHashMap[Any, Any]): HashMap[Any, Any] = {
    val result = new HashMap[Any, Any]
    for (key <- javaMap.keySet().toArray())
      result += key -> javaMap.get(key)
    result
  }

  def main(args: Array[String]): Unit = {
    val jmap: JHashMap[Any, Any] = new JHashMap[Any, Any]
    var smap = new HashMap[Any, Any]
    for (i <- 1 to 9)
      jmap.put(i, "JavaMap" + i)
    smap = transMapValues(jmap)
    smap.foreach(println)
  }
}