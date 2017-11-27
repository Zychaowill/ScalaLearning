package example05.entity

class Teacher(val name: String, val age: Int) {
  
  println("Just constructed another teacher")
  
  def description = name + " is " + age + " years old"
}