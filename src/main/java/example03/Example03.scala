package example03

import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import java.util.TimeZone
import scala.util.Sorting

object Example03 {

  /**
   * Define array with n elements
   */
  def rand(n: Int): Array[Int] = {
    val arr = new Array[Int](n)
    val rand = new Random()

    for (elem <- arr)
      yield rand.nextInt(n);
  }

  def createArr(n: Int) {
    println(rand(n).mkString("<", ",", ">"))
  }

  /**
   * Swap next to two elements
   */
  def swap(arr: Array[Int]): Unit = {
    for (i <- 0 until (arr.length - 1, 2)) {
      val t = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = t
    }
  }

  def swapArray() {
    val a = Array(1, 2, 3, 4, 5)
    swap(a)
    println(a.mkString("<", ",", ">"))

    val b = swapYield(a)
    println(b.mkString("<", "|", ">"))
  }

  def swapYield(arr: Array[Int]) = {
    for (i <- 0 until arr.length) yield {
      if (i < (arr.length - 1) && i % 2 == 0) {
        val tmp = arr(i)
        arr(i) = arr(i + 1)
        arr(i + 1) = tmp
      }
      arr(i)
    }
  }

  def sigArr(arr: Array[Int]) = {
    val buffer = new ArrayBuffer[Int]()
    buffer ++= (for (elem <- arr if elem > 0) yield elem)
    buffer ++= (for (elem <- arr if elem == 0) yield elem)
    buffer ++= (for (elem <- arr if elem < 0) yield elem)
    buffer.toArray
  }

  def callSigArr() {
    val arr = Array(1, 2, -4, -3, 8, 4, 0, 9, -8, 44, 0)
    println(sigArr(arr).mkString("<", "\t", ">"));
  }

  def averageArr(arr:Array[Double]) = {
    arr.sum / arr.length
  }
  
  def callAverageArr() {
    val arr = Array[Double](1, 4, 2, 10, 3, -1, -3)
    val b = averageArr(arr)
    println(b)
  }
  
  def reverseArr() {
    val a = Array(5, 4, 3, 2, 1)
    println(a.reverse.mkString("<", " ", ">"))
    
    val buffer = ArrayBuffer(7, 6, 5, 4, 3)
    println(buffer.reverse.mkString("<", "|", ">"))
  }
  
  def distinctArr() {
    val a = ArrayBuffer(1, 2, 2, 23, 3, 4, 5, 6, 3)
    val b = ArrayBuffer[Int]()
    b ++= a.distinct
    println(b.mkString("<", ",", ">"))
  }
  
  def delRevFirst(arr:Array[Int]) = {
    val indexes = for (i <- 0 until arr.length if (arr(i) < 0)) yield i
    val dropindexes = indexes.reverse.dropRight(1)
    val tmp = arr.toBuffer
    for (index <- dropindexes)
      tmp.remove(index)
    tmp
  }
  
  def timezone() = {
    var arr = TimeZone.getAvailableIDs();
    val tmp = for (elem <- arr if elem.startsWith("America/")) yield {
      elem.drop("America/".length)
    }
    Sorting.quickSort(tmp)
    tmp
  }
  
  def main(args: Array[String]): Unit = {
//    createArr(10)
//    swapArray()
//    callSigArr()
//    callAverageArr()
//    reverseArr()
//    distinctArr()
    
//    val a = Array(1, -2, 3, 4, 5, -1, -3, -4)
//    val b = delRevFirst(a)
//    println(b.mkString("<", ", ", ">"))
    
    println(timezone().mkString("<", "| ", ">"));
  }
}