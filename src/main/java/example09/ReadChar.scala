package example09

object ReadChar {
  import scala.io.Source
  
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/example09/README.md", "UTF-8")
    
/*    val iter = source.buffered
    while (iter.hasNext) {
      if (iter.head == 'S') {
        println(iter.next())
      } 
    }*/
    val contents = source.mkString
    println(contents)
    
    source.close()
  }
}