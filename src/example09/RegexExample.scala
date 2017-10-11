package example09

object RegexExample extends App {
  
  val numPattern = "[0-9]+".r
  val wsnumwsPattern = """\s+[0-9]+\s""".r
  
  val template = "99 bottles, 98 bottles, 97 bottles..."
  for (matchString <- numPattern.findAllIn(template))
      println(matchString)
  
  val matches = numPattern.findAllIn(template).mkString(",")
  println(matches)
  
  val matchResult = numPattern.findFirstIn(template)
  println(matchResult)
  
  val result = wsnumwsPattern.findPrefixOf(template)
  println(result)
  
  println(numPattern.replaceFirstIn(template, "XX"))
  println(numPattern.replaceAllIn(template, "XX"))
  
  val numitemPattern = "([0-9]+) ([a-z]+)".r
  val numitemPattern(num, item) = "99 bottles"
  println("(num, item) => " + (num, item))
  
  for (numitemPattern(num, item) <- numitemPattern.findAllIn(template))
    println(num + " -> " + item)
}