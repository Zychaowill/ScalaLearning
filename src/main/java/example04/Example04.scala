package example04

import scala.collection.mutable.Map
import scala.collection.mutable.SortedMap
import scala.collection.mutable.LinkedHashMap

object Example04 {

  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    println(scores("Bob"))
    
    println(if (scores.contains("Alice")) scores("Alice") else 0)
    
    println(scores.getOrElse("Jacob", 9))
    
    scores("Fred") = 7
    scores("Bob") = 8
    
    scores -= "Alice"
    
    println(scores.keys)
    println(scores.keySet)
//    println(scores.keysIterator.hasNext)
    println(scores.values)
//    println(scores.valuesIterator.hasNext)
    
//    for ((k, v) <- scores) println(k + "->" + v)
//    
//    val newScores = for ((k, v) <- scores) yield (v, k)
//    for ((k, v) <- newScores) println(k + "->" + v)
    
    val otherScores = SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
    for ((k, v) <- otherScores) println(k + "->" + v)
    
    val months = LinkedHashMap("January" -> 1, "February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5)
    for ((k, v) <- months) println(k + "->" + v)
    
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    for ((s, n) <- pairs) Console.print(s * n)
    println()
    println(pairs.toMap)
  }
}