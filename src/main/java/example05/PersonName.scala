package example05

object PersonName {
  
  def main(args: Array[String]): Unit = {
    val person = new PersonName("Jang Zhang")
    println(person.name)
    println(person.firstName)
    println(person.lastName)
  }
}

class PersonName(val name: String) {
  private val namearr = name.split(" ")
  def firstName = namearr(0)
  def lastName = namearr(1)
}