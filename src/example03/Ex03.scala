package example03

import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Buffer
import scala.util.Sorting

object Ex03 {
  
  def fixedLengthArray() {
    val nums = new Array[Int](10)
    val a = new Array[String](10)
    var s = Array("Hello", "World")
    
    println(s(0))
    
    s(0) = "Goodbye"
    println(s(0))
  }
  
  def variableLengthArray() {
    var b = ArrayBuffer[Int]();
    
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array(8, 13, 21)
    
    for (elem <- b)
      print(elem + "\t")
    println()
    
    b.trimEnd(5)
    
    for (elem <- b) 
      print(elem + "\t")
    println()
    
    println("__________________________")
    
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
    for (elem <- b) 
      print(elem + "\t")
    println()
    
    b.remove(2)
    for (elem <- b) 
      print(elem + "\t")
    println()
    
    b.remove(2, 3)
    for (elem <- b) 
      print(elem + "\t")
    println()
    println(b.toArray)
  }
  
  def iteratorArrayAndBuffer() {
    val a = Array(2, 3, 4, 5, 6, 7, 8, 9)
    
    for (i <- 0 until (a.length, 2)) print(i + "\t")
    println()
    
    for (i <- 0 until a.length reverse) print(i + "\t")
    println()
  }
  
  def convertArray() {
    val a = Array(2, 3, 5, 7, 11, 14)
    val result = for (elem <- a) yield 2 * elem
    val evenDoubleResult = for(elem <- a if elem % 2 == 0) yield 2 * elem
    
    for (elem <- result) print(elem + "\t")
    println()
    
    for (elem <- evenDoubleResult) print(elem + "\t")
    println()
    
    for (elem <- a) print(elem + "\t")
    println()
  }
  
  def convertArray2() {
    val a = Array(2, 3, 5, 7, 11, 14)
    val result = a.filter(_ % 2 == 0).map(2 * _)
    
    for (elem <- result) print(elem + "\t")
    println()
    
    val otherResult = a.filter { _ % 2 == 0 } map { 2 * _ }
    for (elem <- otherResult) print(elem + "\t")
    println()    
  }
  
  def convertArray3() {
    val a = ArrayBuffer(2, 3, -5, 5, 7, 11, -13, 14)
    var first = true
    val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
      if (a(i) < 0) first = false; i
    }
    
    for (j <- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length - indexes.length)

    for (elem <- a) print(elem + "\t")
    println()        
  }
  
  def commonAlgo() {
    println(Array(1, 7, 2, 9).sum)
    println(Array(2, 5, 13, 7, 4).min)
    println(ArrayBuffer("Mary", "had", "a", "little", "lamb").max)
    
    val b = ArrayBuffer(1, 7, 2, 9)
    val aSorted = b.sorted
    val dSorted = b.sortWith(_ > _)
    for (elem <- aSorted) print(elem + "\t")
    println()
    for (elem <- dSorted) print(elem + "\t")
    println()
    
    val a = Array(1, 7, 6, 2, 9)
    Sorting.quickSort(a)
    println(a.mkString("<", ",", ">"))
  }
  
  def scalaCallJava() {
    val command = ArrayBuffer("ls", "-al", "/home/cay")
    val pb = new ProcessBuilder(command)
    val cmd: Buffer[String] = pb.command()
    println(cmd == command)
    
    for (elem <- cmd) print(elem + "\t")
    println()
  }
  
  def main(args:Array[String]):Unit = {
//    fixedLengthArray()
//    variableLengthArray()
//    iteratorArrayAndBuffer()
//    convertArray()
//    convertArray2()
//    convertArray3()
//    commonAlgo()
    scalaCallJava()
  }
  
}