package example09

import java.io.File
import java.nio.file._

object AccessDirectory {
  def main(args: Array[String]): Unit = {
    val parent = new File("src")
    val fileIterator = subdirs(parent)
    while (fileIterator.hasNext) {
      println(fileIterator.next.getName)
    }
    
//    Files.walkFileTree(parent.toPath, (f: Path) => println(f))
  }
  
  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
  
  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }
}