package example02

object Ex2 {
    
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
  
  def main(args: Array[String]): Unit = {
    println(xn(2, -3))
    println(product("Hello"))
  }
}