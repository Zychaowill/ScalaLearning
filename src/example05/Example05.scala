package example05

/**
  * Created by yachao on 17/10/9.
  */
object Example05 {

  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment();
    println(myCounter.current)
  }
}
