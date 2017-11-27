package example02

object Ex2 {
    
  def reverseNum(n:Int) {
    for (i <- 0 to n reverse)
      print(i + "\t")
    println()
  }
  
  def xn(x:Double, n:Int):Double = {
    if (n == 0)
      1
    else if (n < 0)
      1/xn(x, -n)
    else if (n % 2 == 0)
      xn(x, n/2) * xn(x, n/2)
    else
      x * xn(x, n - 1)
  }
  
  def product(str:String):Long = {
    var t:Long = 1
    str.foreach(t *= _)
    t
  }
  
  def product2(str:String):Long = {
    if (str.length == 1)
      str.charAt(0)
    else
      str.charAt(0) * product2(str.drop(1))
  }
  
  def main(args: Array[String]): Unit = {
    reverseNum(10)
    println(xn(2, -3))
    println(product("Hello"))
    println(product2("Hello"))
  }
}