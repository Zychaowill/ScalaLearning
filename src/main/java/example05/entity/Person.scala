package example05.entity

import scala.beans.BeanProperty

class Person {
  private var privateAge = 0
  @BeanProperty var name: String = _
  
  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > age) privateAge = newValue
    else if (newValue < 0) privateAge = 0
  }
}