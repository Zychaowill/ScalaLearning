package example06

object Accounts {
  private var lastNumber = 0
  
  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

class Accounts {
  val id = Accounts.newUniqueNumber()
  private var balance = 0.0
  
  def deposit(amount: Double) {
    balance += amount
  }
}