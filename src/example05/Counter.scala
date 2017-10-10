package example05

object Counter {
  
  def main(args: Array[String]): Unit = {
    val max = Int.MaxValue
    println("Int max value is: " + max)
    val counter = new Counter
    for (1 <- 1 to (max))
      counter.increment()
    println("Counter increment " + max + " times is: " + counter.current)
  }
}

class Counter {
  private var value = 0
  
  def increment() {
    if (value < Int.MaxValue)
      value += 1
  }
  
  def current = value
}