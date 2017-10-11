package example09.ex.ex10

import scala.collection.mutable.ArrayBuffer
import java.io.ObjectOutputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.FileInputStream

object Person extends App {
  lazy val fileName = "src/example09/ex/ex10/Person.txt"
  val p1 = new Person("JackChen")
  val p2 = new Person("Jhon·D")
  val p3 = new Person("Sunday")
  
  p1.add(p2)
  p1.add(p3)
  println(p1)
  
  val out = new ObjectOutputStream(new FileOutputStream(fileName))
  out.writeObject(p1)
  out.close()
  
  val in = new ObjectInputStream(new FileInputStream(fileName))
  val person = in.readObject().asInstanceOf[Person]
  println(person)
}

class Person(var name: String) extends Serializable {
  val friends = new ArrayBuffer[Person]()

  def add(friend: Person) {
    friends += friend
  }

  override def toString(): String = {
    var str = "My name is " + name + " and my friends name is "
    friends.foreach(str += _.name + ",")
    str.substring(0, str.length() - 1)
  }
}