package example05

import example05.entity.Counter
import example05.entity.Network
import example05.entity.Person
import example05.entity.Student
import example05.entity.Teacher
import example05.entity.NetworkParal

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
    println(teacher.description + "\n")
    
    /* Start */
    val chatter = new Network
    val myFace = new Network
    
    val fredMem = chatter.join("Fred")
    val wilmaMem = chatter.join("Wilma")
    fredMem.contacts += wilmaMem
    
    val barneyMem = myFace.join("Barney")
//    fredMem.contacts += barneyMem // Can not be finished
    /* End */
    
    /* Start Object paral: For any Network Member */
    val chatterParal = new NetworkParal
    val myFaceParal = new NetworkParal
    
    val fm = chatterParal.join("FM")
    val wm = chatterParal.join("WM")
    fm.contacts += wm
    
    val bm = myFaceParal.join("BM")
    fm.contacts += bm // It is OK
    /* End */
  }
}
