package example05

object BankAccount {
  def main(args: Array[String]): Unit = {
    val withdrawAmount = 800
    val depamount = 1000
    
    val bankAccount = new BankAccount
    
    bankAccount.deposit(depamount)
    println(bankAccount.current)
    
    
    if (bankAccount.withdraw(withdrawAmount))
      println(bankAccount.current)
    
    if (bankAccount.withdraw(withdrawAmount))
      println(bankAccount.current)
  }
}

class BankAccount {
  private var balance = 0.0
  
  def deposit(depamount: Double) {
    balance += depamount
  }
  
  def withdraw(withdrawAmount: Double):Boolean = {
    var flag = true
    if (withdrawAmount <= balance) {
      balance -= withdrawAmount
      flag
    } else {
      println("No enough money.")
      !flag
    }
  }
  
  def current = balance
}