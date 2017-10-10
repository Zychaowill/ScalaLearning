package example07.horstmann.impatient


package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName
    
    private[people] def description = "A person with name " + name
    
    private[impatient] def descriptor = "A person with name " + name
  }
}