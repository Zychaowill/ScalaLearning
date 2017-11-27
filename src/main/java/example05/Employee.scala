package example05

object Employee {
  def main(args: Array[String]): Unit = {
    val employee = new Employee
    val bankEmployee = new Employee("Tom Hanks", 100000)

    println(employee.toString())
    println(bankEmployee.toString())
  }
}

class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Q. Public", 0.0)
  }

  override def toString(): String = {
    "Name:" + name + ", Salary:" + salary
  }
}