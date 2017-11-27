package example09

import java.io.File
import java.io.FileInputStream

object ReadBinFile {
  def main(args: Array[String]): Unit = {
    val file = new File("src/example09/README.md")
    val in = new FileInputStream(file)
    val bytes = new Array[Byte](file.length.toInt)
    in.read(bytes)
    
    println(new String(bytes))
    in.close()
  }
}