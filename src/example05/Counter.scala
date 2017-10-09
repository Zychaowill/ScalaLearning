package example05

/**
  * Created by yachao on 17/10/9.
  */
class Counter {

  private var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current = value
}
