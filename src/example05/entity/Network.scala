package example05.entity

import scala.collection.mutable.ArrayBuffer

class Network { outer =>
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  
  private val members = new ArrayBuffer[Member]
  
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}