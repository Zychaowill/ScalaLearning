package example05.entity

/**
  * Created by yachao on 17/10/9.
  * U can not only implement setter method in Scala.
  */
class Counter {

  private var value = 0
  /* private[this] means that access method is not allowed by object.value */
//  private[this] var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current = value
  
  def isLess(other: Counter) = value < other.value
}
