package example06

object NewAccount {
  def apply(initialBalance: Double) = {
    new NewAccount(newUniqueNumber(), initialBalance)
  }
  
  private var lastNumber = 0
  
  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
  
  def main(args: Array[String]): Unit = {
    val account = NewAccount(1000.0)
    println(account.toString())
    
    val account2 = NewAccount(2000.0)
    println(account2.toString())
  }
}

class NewAccount private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  
  override def toString():String = {
    id + ":" + balance
  }
}