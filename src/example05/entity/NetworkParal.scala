package example05.entity

import scala.collection.mutable.ArrayBuffer

object NetworkParal {
  class MemberParal(val name: String) {
    val contacts = new ArrayBuffer[MemberParal]
  }
}

class NetworkParal {
  private val members = new ArrayBuffer[NetworkParal.MemberParal]
  
  def join(name: String) = {
    val member = new NetworkParal.MemberParal(name)
    members += member
    member
  }
}