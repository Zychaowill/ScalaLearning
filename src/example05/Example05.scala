package example05

import example05.entity.Person

import example05.entity.Counter
import example05.entity.Student
import example05.entity.Teacher

/**
  * Created by yachao on 17/10/9.
  */
object Example05 {

  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment();
    println(myCounter.current + "\n")
    
    val fred = new Person
    fred.age = 30
    fred.age = 21
    println(fred.age + "\n")
    
    val stu1 = new Student
    val stu2 = new Student("Fred")
    val stu3 = new Student("Fred", 42)
    
    val teacher = new Teacher("Fred", 42)
  }
}
