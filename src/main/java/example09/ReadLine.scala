package example09

object ReadLine {
  import scala.io.Source
  
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/example09/README.md", "UTF-8")
    
    val lineIterator = source.getLines
    while (lineIterator.hasNext) {
      println(lineIterator.next())
    }
    println("--------------------------")
    
/*    val strArray = source.getLines.toArray
    for (elem <- strArray) println(elem)
    println("--------------------------")
    
    val oneString = source.mkString
    println(oneString)*/
    source.close()
  }
}